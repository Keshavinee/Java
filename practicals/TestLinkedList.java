import java.util.*;

class Student{
    String name;
    int rno;

    Student(String n, int r){
        name = n;
        rno = r;
    }

    public String toString(){
        return (name + " " + rno);
    }
}

public class TestLinkedList{
    public static void main(String[] args) {
        LinkedList<Student> ll = new LinkedList<Student>();
        ll.add(new Student("Keshav", 101));
        ll.addFirst(new Student("Raam", 102));
        
        /*for (Student student : ll) {
            System.out.println(student);
        }

        Iterator obj = ll.iterator();

        while (obj.hasNext()) {
            System.out.println(obj.next());
        }*/

        ListIterator lobj = ll.listIterator();

        while (lobj.hasNext()) {
            
            System.out.println(lobj.next());
            lobj.set(new Student("Magu", 108));
            System.out.println(lobj.next());
        }

        /*for (Student student : ll) {
            System.out.println(student);
        }*/

        System.out.println(ll);
    }
}