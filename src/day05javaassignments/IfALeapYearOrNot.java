/* 
--> Leap Year
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.
*/
package day05javaassignments;

import java.util.Random;
import java.util.Scanner;

public class IfALeapYearOrNot {
	
	static int randomYear;
	static int checkAnotherYear;
	
	static int isRandomFourDigit(){
		do {
		randomYear=(int)(Math.random()*10000);
		}while(randomYear < 1000);
	return randomYear;
	}
	
	public static void main(String[] args) {
	
		Scanner getYear = new Scanner(System.in);
		
		System.out.println("Enter number of Random Leap_Year You Want :");
		int numberOfLeapYear=getYear.nextInt();
		for(int i = 0; i<=numberOfLeapYear;i++) {			
//checking output of Four digit number	
		System.out.println(IfALeapYearOrNot.isRandomFourDigit());
		}
		do {
				System.out.println("Enter a Year You Want to check");
				int enteredYear=getYear.nextInt();
				if(enteredYear>999 && enteredYear<100000) {
					if (enteredYear%4 == 0 && enteredYear%100 != 0) {
						System.out.println(enteredYear+" is a Leap Year ::");
					}else if(enteredYear%400==0) {
						System.out.println(enteredYear+" is a Leap Year ::");
					}else {
						System.out.println(enteredYear+" is a not Leap_Year $$");
					}
				}else {
					System.out.println(":::   Caution: Enter a year in  '' Positive 4-digit ''  number only   :::"+'\n');
				}
		System.out.println("If you Want to check another year, Enter 1 ::");
		checkAnotherYear=getYear.nextInt();
		
		}while(checkAnotherYear==1);
		
	}

}
