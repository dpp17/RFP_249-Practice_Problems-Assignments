package day06javaassignments.logicalprograming;

import java.util.Scanner;

public class RverseANumber {

		//EXCEPTIONS:: 0123-321; 120-21
		//main method

	static int numberReversing(int numberOne) {
	int reverseNumber=0;
	while(numberOne>0) {
		reverseNumber=reverseNumber*10+numberOne%10;
		numberOne=numberOne/10;
	}	
	return reverseNumber;
}

			public static void main(String[] args) {
				
				Scanner getUseInput = new Scanner(System.in);
				
				System.out.println("Enter a number to reverse :: ");
				int numberToReverse=getUseInput.nextInt();
				
				System.out.println("Original number :: "+numberToReverse+"  Reversed number :: "+numberReversing(numberToReverse));
				
	}

}
