//Java Program to Swap Two Numbers
package day05javaassignments;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		Scanner inputNumbers = new Scanner(System.in);
		int numberOne=inputNumbers.nextInt();
		int numberTwo=inputNumbers.nextInt();
		System.out.println("Enter Two Number :: "+numberOne+" and "+numberTwo);
		int reserveNumber=0;
		reserveNumber=numberOne+numberTwo;
		numberOne=reserveNumber-numberOne;
		numberTwo=reserveNumber-numberTwo;
		System.out.println("Swaped Two Numbers ::"+numberOne+" and "+numberTwo);
	}

}
