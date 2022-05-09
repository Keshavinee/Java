import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {
    public static void main(String[] args) {
    
        LinkedList <Integer> ll = new LinkedList<Integer>();
        for (int j = 0; j < 10; j++) {
            ll.add(j);
        }

        // Insert element on both sides
        ll.addLast(2);
        ll.addFirst(3);

        // Delete element on both sides
        ll.removeFirst();
        ll.removeLast();

        // Delete a particular element
        ll.remove(6);
        System.out.println(ll);

        // Search for a particular element
        System.out.println(Collections.binarySearch(ll, 5));

        // Display list in forward order and backward order
        ListIterator<Integer> li = ll.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next()+" ");
        }
        System.out.println("\n");

        while (li.hasPrevious()) {
            System.out.print(li.previous()+" ");
        }
        System.out.println("\n");


        Collections.shuffle(ll);
        System.out.println(ll);

        //Sort the elements in LinkedList
        System.out.println("After sorting:");
        Collections.sort(ll);

        // Replace one element in the list with another list
        for (int i = 0; i < 3; i++) {
            ll.set(i+3, ll.get(i));
        }
        System.out.println(ll);
    }
}
