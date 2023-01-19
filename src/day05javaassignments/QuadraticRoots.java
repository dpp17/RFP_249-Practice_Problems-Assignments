package day05javaassignments;

import java.util.Scanner;

public class QuadraticRoots {

	public static void main(String[] args) {
		
		Scanner getcoefficients = new Scanner(System.in);
//coefficient for 'x*x'		
		System.out.println("Enter a coefficient for 'x*x' : ");
		int xSqrCoefficient=getcoefficients.nextInt();
//coefficient for 'x'
		System.out.println("Enter a coefficient for 'x' : ");
		int xCoefficient=getcoefficients.nextInt();
//constant
		System.out.println("Enter a constant for  : ");
		int constant=getcoefficients.nextInt();
//formula based
		int delta = xCoefficient*(4*xSqrCoefficient*constant);
		double firstRoot=(-xCoefficient + Math.sqrt(delta))/(2*xSqrCoefficient);
		double secondRoot=(-xCoefficient - Math.sqrt(delta))/(2*xSqrCoefficient);
		
		System.out.println("First root :: "+firstRoot);	//1st root
		System.out.println("Second root :: "+secondRoot);//2nd root
		
	}

}
