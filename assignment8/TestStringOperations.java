import java.util.*;

public class TestStringOperations {
    public static void main(String[] args) {
        ArrayList <String> s = new ArrayList<String>();

        // a. Append - add at end 
        s.add("Java");
        s.add("Python");
        s.add("C++");

        // Insert – add at particular index 
        s.add(1, "C");

        // Find the index of a particular element (Search)
        System.out.println(s.indexOf("Python"));

        //Display the list
        System.out.println(s);

        // Sort the elements in ArrayList
        Collections.sort(s);
        System.out.println("After sorting:");
        System.out.println(s);

        // Remove a particular element
        s.remove("C++");

        // Replace one string with another string in ArrayList
        s.set(1, "Julia");

        // Remove duplicate elements
        s.add("Java");
        s.add("C++");
        s.add("Julia");
        System.out.println("After adding duplicates:");
        ArrayList<String> newList = new ArrayList<String>();
        for (String element : s) {
  
            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {
  
                newList.add(element);
            }
        }
  
        s = newList;
        System.out.println(s);

        // List all string starts with given letter
        for (String string : s) {
            if (string.startsWith("J")) {
                System.out.println(string);
            }
        }

        // List of all string contains the Substring
        for (String string : s) {
            if (string.contains("ytho")) {
                System.out.println(string);
            }
        }
    }
}