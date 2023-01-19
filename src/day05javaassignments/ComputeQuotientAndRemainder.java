//Java Program to Compute Quotient and Remainder
package day05javaassignments;

import java.util.Scanner;

public class ComputeQuotientAndRemainder {

	public static void main(String[] args) {
		Scanner inputNumbers = new Scanner(System.in);
		
		System.out.println("Enter Dividend :: ");
		int dividend=inputNumbers.nextInt();	//dividend input
		System.out.println("Enter Divisor :: ");
		int divisor=inputNumbers.nextInt();		//divisor input
		
		int quotient = dividend/divisor;		//quotient calculated
		int remainder = dividend%divisor;		//remainder calculated
		
		System.out.println("Computed_Output Remainder :: " + remainder );
		System.out.println("Computed_Output Quotient :: " + quotient );
		

	}

}
