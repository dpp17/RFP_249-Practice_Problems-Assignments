/*a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.*/

package day05javaassignments;

import java.util.Scanner;

public class NthValueOfHarmonicSeries {

	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.println("Enter a Number for Harmonic_Series :: ");
		int nthHarmonicNumber=inputNumber.nextInt();					//Nth number input taken
		
		if(nthHarmonicNumber!=0) {			//condition checked for not_zero, if number is 0 then series will be infinite
			System.out.println("::    Harmonic Series Is    ::");
				
				for(int i=1 ; i<=nthHarmonicNumber; i++) {
					
					System.out.print("+ 1/"+i);					//Harmnic_Series creation
				}
				System.out.println('\n');
		}
		else {
			System.out.println("::    Enter A Number Greater Than Zero    ::");
		}
	System.out.println("Nth Harmonic Number is :: 1/"+nthHarmonicNumber);    //nth number of harmonic series
	}

}
