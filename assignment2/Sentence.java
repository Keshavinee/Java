import java.util.Scanner;

class LongestWord{
	void longWord(String s){
		int c=0, max=0, index=0, id=0;
		String word = "", lword = "";

		for (int i = 0; i < s.length(); i++){

			if ((s.charAt(i)) != ' '){
				if (c == 0){
					id = i;
				}
				c++;
				word = word + s.charAt(i);
			}
			else{
				if (c >= max){
					index = id;
					max = c;
					lword = word;
				}
				word = "";
				c = 0;
			}	
		}
		if (c >= max) {
			index = id;
			lword = word;
		}
		
		System.out.print("The longest word is " + lword + " ");
		System.out.println("and it is found at an index  " + index);
	}
}

public class Sentence{
	public static void main(String []args){
		String s;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		s = in.nextLine();
		
		LongestWord obj = new LongestWord();
		obj.longWord(s);

		in.close();
	}
}
