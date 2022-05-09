import java.util.Scanner;

class PangramCheck {

    void pangram(String sentence){

        int j, flag = 1; 
        String s = sentence.toLowerCase();
        int []b = new int[26];
        char []a = new char[26];
        
        // Array of lowercase letters
        for (int i = 97; i < 123; i++) {
            a[i-97] = (char) i;
        }

        // Array of zeroes
        for (int i = 0; i < 26; i++) {
            b[i] = 0;
        }

        // Counting no. of occurrences of each letter
        for (int i = 0; i < s.length(); i++) {
            j = 0;
            while (j<26) {
                if (a[j] == s.charAt(i)) {
                    b[j]++; 
                    break;
                }
                j++;
            }
        }

        // Checking whether the sentence is pangram or not
        for (int i = 0; i < 26; i++) {
            if (b[i] < 1) {
                System.out.println("The sentece is not a Pangram!");
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("The sentence is a pangram!");
        }

        // frequency of letter
        for (int i = 0; i < 26; i++) {
            System.out.println(a[i] + " : " + b[i]);
        }
    }
}

public class Pangram {
    public static void main(String[] args) {
        String sentence;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a string: ");
        sentence = in.nextLine();

        PangramCheck obj = new PangramCheck();
        obj.pangram(sentence); 

        in.close();
    }
}
