//Java Program to Add Two Matrix Using Multi-dimensional Arrays
package day06javaassignments.arrays;

import java.util.Scanner;

public class AddTwoMatrixUsingMultidimensionalArray {

//method 1
	static void userInputAddition() {
		Scanner getUserInput = new Scanner(System.in);
				int[][] matrixArraySum = new int[2][2];
				int[][] matrixArrayOne=  new int[2][2];
				int[][] matrixArrayTwo=  new int[2][2];
		System.out.println("enter 1st array 2x2 matrix :: ");
				matrixArrayOne[0][0]=getUserInput.nextInt();
				matrixArrayOne[0][1]=getUserInput.nextInt();
				matrixArrayOne[1][0]=getUserInput.nextInt();
				matrixArrayOne[1][1]=getUserInput.nextInt();
		System.out.println("enter 2nd array 2x2 matrix :: ");
				matrixArrayTwo[0][0]=getUserInput.nextInt();
				matrixArrayTwo[0][1]=getUserInput.nextInt();
				matrixArrayTwo[1][0]=getUserInput.nextInt();
				matrixArrayTwo[1][1]=getUserInput.nextInt();
		
		System.out.print(":: Method( 1 ) :: matrixArraySum[2][2] :: ");
				for(int i=0;i<2;i++) {
					for(int j=0;j<2;j++) {			
						matrixArraySum[i][j]=matrixArrayOne[i][j]+matrixArrayTwo[i][j];
						System.out.print(matrixArraySum[i][j]+" ");
					}
					System.out.print("");
				}
	}

	
//method 2
	static void assignedValueAddition() {
		int[][] firstMatrixArray= {{2},{4},{8},{10}};
		int[][] secondMatrixArray= {{9},{8},{5},{4}};
		int[][] addMatrixArray = {{0},{0},{0},{0}};
		
		System.out.print(":: Method( 2 ) :: matrixArraySum[2][2] :: ");
		for(int i=0;i<=3;i++) {
			addMatrixArray[i][0]=firstMatrixArray[i][0]+secondMatrixArray[i][0];
				System.out.print(addMatrixArray[i][0]+" ");
			System.out.print("");
		}
	}

	
//main_method
	public static void main(String[] args) {
		Scanner getUserInput = new Scanner(System.in);
		byte option=0;
		do {
		System.out.println("Enter 1.FOR USER INPUT :: ");
		System.out.println("Enter 2.FOR DEMO :: ");
		option=getUserInput.nextByte();
		if(option==1) {
//method 1 called
		
		AddTwoMatrixUsingMultidimensionalArray.userInputAddition();
		System.out.println("");
		option=0;
		}else if(option==2){
//method 2 called		
		
		AddTwoMatrixUsingMultidimensionalArray.assignedValueAddition();
		System.out.println('\n');
		option=0;
		}
		}while(option!=0);
		System.out.println('\t'+"   ::  Thank you!! for your Visit.  ::"+'\n'+'\t'+'\t'+"::  Please Try Later  ::");

	}

}
