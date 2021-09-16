/**
 * This program is to check whether the given number is odd or even
 * @author keshav
 * @version 1.0
 */

import java.util.Scanner;

public class odd_even_number {
	/**
	 * This method is used to find odd and even number
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int number;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number = in.nextInt();
		
		if (number %2 == 0) {
			System.out.println("The given number is even.");
		} 
		else {
			System.out.println("The given number is odd.");
		}
	}

}
