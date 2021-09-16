import java.util.Scanner;

/**
 * This program is to find the factorial of a number
 * @author keshav
 * @version 1.0
 */
public class factorial {
	/**
	 * This method is used to find factorial of a number
	 * @param args
	 */
	public static void main(String[] args) {
		int number;
		int fact = 1;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number = in.nextInt();
		
		while (number > 0) {
			fact = fact * number;
			number = number - 1;
			}
		System.out.println("Factorial of given number: ");
		System.out.print(fact);
	}

}
