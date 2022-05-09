from logging import error
from sqlite3 import DatabaseError
import sys,os,math
import psycopg2


def cosine():
    file = open("parameter.txt","r")
    c = file.read()
    file.close()

    query = "select sum(host_team_score) from matches \
where host_team_score > guest_team_score and host_team_id in\
(select team_id from teams where name LIKE '{}%')".format(c)
    conn = None
    try:
        conn = psycopg2.connect(database=sys.argv[1],user = os.environ.get('PGUSER') ,\
password = os.environ.get('PGPASSWORD'),host = os.environ.get('PGHOST'), \
port = os.environ.get('PGPORT'))
        cur = conn.cursor()
        cur.execute(query)
        rows = cur.fetchall()
        sum = rows[0]
        x=sum*10
        x_deg=x*((math.pi)/180)
        print(round(math.cos(x_deg)))

        cur.close()
    except (Exception,psycopg2.DatabaseError) as error:
        print(error)
    finally:
        conn.close()

cosine()

    

