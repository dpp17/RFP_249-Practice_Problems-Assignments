package day06javaassignments.logicalprograming;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner getUserInput = new Scanner(System.in);
		System.out.println("Enter a number :: ");
		int loopNumber=getUserInput.nextInt();
		int numberOne=0;
		int numberTwo=1;
		int nextNumber;
		for (int i = 0;i<loopNumber;i++) {
			nextNumber=numberOne+numberTwo;
			System.out.print(nextNumber+" ");
			numberOne=numberTwo;
			numberTwo=nextNumber;
		}
		
	}

}
