import sys
import os
import psycopg2

file = open("date.txt", "r")
date = file.read()
file.close()

query = "select name from referees where referee_id in (select referee from match_referees as mr, matches as m where mr.match_num = m.match_num and m.match_date = {})".format(
      date)
conn = None
try:
        conn = psycopg2.connect(database=sys.argv[1], user=os.environ.get('PGUSER'), password=os.environ.get(
            'PGPASSWORD'), host=os.environ.get('PGHOST'), port=os.environ.get('PGPORT'))
        cur = conn.cursor()
        cur.execute(query)
        rows = cur.fetchall()
        for row in rows:
            l = row.split()
            name = l[-1]
            for i in range(0, len(l)):
                name = name+" "+l[i][0]+"."
            print(name)
        cur.close()
except (Exception, psycopg2.DatabaseError) as error:
        print(error)
    finally:
        conn.close()
