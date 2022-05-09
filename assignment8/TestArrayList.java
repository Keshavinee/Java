import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {
        int f=0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        
        ArrayList<Integer> c = new ArrayList<Integer>();
        ArrayList<Integer> d = new ArrayList<Integer>();
        Set<Integer> s = new HashSet<Integer>();
        
        a.add(5);a.add(6);a.add(8);
        b.add(9);b.add(6);

        // Merge the two lists
        c.addAll(a);
        c.addAll(b);
        System.out.println("Merging two lists: "+c);

        // Union of two lists
        s.addAll(c);
        System.out.println("Union of two lists: "+s);

        // Intersection of two lists
        for (Integer integer : a) {
            if (b.contains(integer)) {
                d.add(integer);
            }
        }
        System.out.println("Intersection of two lists: "+d);
        // Comparison of two lists
        for (Integer integer : a) {
            if (!b.contains(integer)) {
                f=1;
                break;
            }
        }
        if (f==0) {
            System.out.println("a is subset of b!");
        }

        f=0;

        for (Integer element : b) {
            if (!a.contains(element)) {
                f=1;
                break;
            }
        }
        if (f==0) {
            System.out.println("a is subset of b!");
        }

        System.out.println(c);
    }
}
