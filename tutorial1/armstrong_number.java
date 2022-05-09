import java.util.Scanner;
import java.lang.Math;

/**
 * This program is used to find whether the given number is Armstrong number or not
 * @author keshav
 * @version 1.0
 */
public class armstrong_number {
	/**
	 * This method is used to find an armstrong number
	 * @param args
	 */
	public static void main(String[] args) {
		int number,copy;
		int count = 0, sum =0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number = in.nextInt();
		copy = number;
		
		while (number > 0) {
			
			number = number / 10;
			count = count + 1;
		}
		
		number = copy;
		while (number > 0) {
			sum = sum + (int) Math.pow((number % 10), count);
			number = number / 10;
		}
		
		if (copy == sum) {
			System.out.println("It is an armstrong number.");
		}
		
		else {
			System.out.println("It is not an armstrong number.");
		}

	}

}
