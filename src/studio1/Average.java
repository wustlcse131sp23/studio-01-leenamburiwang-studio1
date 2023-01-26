package studio1;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type your first number please: ");
		double num1 = in.nextDouble();
		System.out.println("Type your second number please: ");
		double num2 = in.nextDouble();
		double num3 = (num1+num2)/2;
		System.out.println("The average of "+ num1 +" and "+ num2 + " is "+ num3+ ".");
		
	}
	

}

