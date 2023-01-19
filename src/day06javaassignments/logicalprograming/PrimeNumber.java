package day06javaassignments.logicalprograming;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner getUserInput = new Scanner(System.in);
		
		System.out.println("Enter a number :: ");
		int toCheckNumber=getUserInput.nextInt();
		int checker=0;
		for(int i =1;i<=toCheckNumber;i++) {
			if (toCheckNumber%i==0) {
				checker++;
			}
		}
		if(checker==2) {
			System.out.println("Entered Number is a prime number ::"+toCheckNumber);
		}else {
			System.out.println("Entered Number is ' NOT ' a prime number ::"+toCheckNumber);
		}
		
	}

}
