import java.util.Scanner;

class InnerPalindrome {

    String word;

    InnerPalindrome(String wrd){
        word = wrd;
    }

    void palindrome(){
        int i = 0,flag = 0;
        String w = word.toLowerCase();
        while (i <= ((w.length()-1) / 2)) {
            if (w.charAt(i) != (w.charAt(w.length()-1-i)) ) {
                System.out.println(word + " is not a palindrome!");
                flag = 1;
                break;
            }
            i++;
        }
        if (flag != 1) {
            System.out.println(word + " is a palindrome!");
        }
    }
}
public class Palindrome {

    public static void main(String[] args) {

        String str;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = in.nextLine();

        InnerPalindrome obj = new InnerPalindrome(str);
        obj.palindrome();

        in.close();
    }
}
