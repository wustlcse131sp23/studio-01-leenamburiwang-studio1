package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first name: ");
		String name1 = in.nextLine();
		System.out.print("Enter the second name: ");
		String name2 = in.nextLine();
		System.out.print("Enter the third name: ");
		String name3 = in.nextLine();
		System.out.print("Enter the fourth name: ");
		String name4 = in.nextLine();
		//
		// Say hello to the names in s0 through s3.
		//
		System.out.println("Greetings " + name1 + ", " + name2 + ", " + name3 + ", and " + name4 + ".");

	}
}

