//Java Program to Check Whether a Number is Even or Odd
package day05javaassignments;

import java.util.Scanner;

public class CheckNumberIsEvenOrOdd {

	static void isEvenOrOdd(int numberToCheck){
		if(numberToCheck%2==0) {
			System.out.println("Entered Number "+ numberToCheck +" is Even");
		}else {
		System.out.println("Entered Number "+ numberToCheck +"  is Odd.");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.println("Enter a Number :: ");
		int getNumberToCheck=inputNumber.nextInt();//input number taken
		
		CheckNumberIsEvenOrOdd.isEvenOrOdd(getNumberToCheck);	//using static method to check even or odd
	
	}

}
