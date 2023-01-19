//Java Program to Find the Largest Among Three Numbers
package day05javaassignments;

import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		
//		int numberOne=9 ; int numberTwo=10; int numberThree=12;						//initialization of three integer_variables
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.println("Enter 1st Number :: ");
		int numberOne=inputNumber.nextInt();					// 1st input number taken		
		
		System.out.println("Enter 2nd Number :: ");
		int numberTwo=inputNumber.nextInt();					// 2nd input number taken
		
		System.out.println("Enter 3rd Number :: ");
		int numberThree=inputNumber.nextInt();      			// 3rd input number taken
		
		
		if (numberOne>numberTwo && numberOne>numberThree) {							//1>2 and 1>3
			System.out.println(": NumberOne is greatest :");
					if (numberOne == numberThree) {									//1>2 and 1>3 and,if 2==3
						System.out.println(": NumberOne and NumberThree are same :");
					}
		}
		else if (numberTwo>numberOne && numberTwo>numberThree) {					//2>1 and 2>3
			System.out.println(": NumberTwo is greatest :");
					if (numberOne == numberThree) {									//2>1 and 2>3 and,if 1==3
						System.out.println(": NumberOne and NumberThree are same :");
					}
		}
		else if(numberThree>numberTwo && numberThree>numberOne) {					//3>2 and 3>1
			System.out.println(": NumberThree is greatest :");	
					if (numberOne == numberTwo) {									//3>2 and 3>1 and,if 2==1
						System.out.println(": NumberOne and NumberTwo are same :");
					}
		}
		else if(numberThree==numberTwo && numberThree!=numberOne) {					//3==2 and 3!=1
			System.out.println(": NumberThree and NumberTwo are same :");
		}
		else if(numberThree==numberOne && numberTwo!=numberOne) {					//3==1 and 3!=2
			System.out.println(": NumberOne and NumberThree are same :");
		}
		else if(numberTwo==numberOne && numberThree!=numberOne) {					//2==1 and 3!=1
			System.out.println(": NumberOne and NumberTwo are same :");
		}
		else {																		//1==2==3
			System.out.println("::   All Numbers  are same   ::");
		}

	}

}
