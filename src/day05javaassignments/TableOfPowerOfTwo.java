/*a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not.*/
package day05javaassignments;

import java.util.Scanner;

public class TableOfPowerOfTwo {

	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		boolean checker=false;
	  	do {
	  		System.out.println("Enter Power Of '2' :: ");
			int maxPower=inputNumber.nextInt();				//maximum power input
			if (maxPower<31) {						//Only works if 0 <= N < 31 since 2^31 overflows an int
					for(int i=0; i<maxPower; i++) {
						
						System.out.println("2^"+i+" = "+(int)(Math.pow(2, i)));//type_casting to convert double to int
					checker=false;
					}
			}else {
				System.out.println("Enter a power less than 31.");	
				checker=true;
			}
	  	}while(checker == true);
	}

}
