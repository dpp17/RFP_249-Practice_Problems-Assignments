/*

Perfect Number
a. Just like the Armstrong number, the Perfect Number is also a special type of
positive number. When the number is equal to the sum of its positive divisors
excluding the number, it is called a Perfect Number. For example, 28 is the perfect
number because when we sum the divisors of 28, it will result in the same number.
The divisors of 28 are 1, 2, 4, 7, and 14. So,
b. 28 = 1+2+4+7
c. 28 = 28

 */
package day06javaassignments.logicalprograming;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner getUserInput = new Scanner(System.in);
		
		System.out.println("How many perfect numbers do you want ::");
		int getNumber=getUserInput.nextInt();
	
		int sum=0;
		
		for (int i=1;i<getNumber;i++) {
			if (getNumber%i==0) {	//getting factors
				sum=sum+i;
				System.out.print("+"+i); 
					
					if(sum==getNumber) {	//checking for perfect number,if sum of factors =number then perfect number
						System.out.println(":  Sum  :: "+sum);
						break;
					}	
			}			
		}
	
		

	}
}
