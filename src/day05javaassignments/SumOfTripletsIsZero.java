package day05javaassignments;

import java.util.Scanner;

public class SumOfTripletsIsZero {
//"  { Sum of triplets is zero }  "
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getInput = new Scanner(System.in);
		
		System.out.println(" Enter no. of size :: ");
		int size = getInput.nextInt();

		int[] inputArray = new int[size];

		
		for(int i = 0; i < inputArray.length; i++) {
			inputArray[i] = getInput.nextInt();
		} 
																		//case 1...case2..case3..case4..case5..case6
		for(int z = 0; z < inputArray.length - 2; z++) {//0,1,2				0		0	 	0	   1	  1		 2
			for(int i = z+1; i < inputArray.length - 1; i++) {//0,1,2,3			1		2	 	3	   2	  3		 3
				for(int j = i+1; j < inputArray.length ; j++) {//0,1,2,3,4		2,3,4	3,4	 	4	   3,4	  4		 4
					int sum = 1;
					sum=inputArray[j] + inputArray[i] + inputArray[z];
					if (sum == 0)
					{
						System.out.println("triplets :: " + inputArray[j] +" "+ inputArray[i] +" "+ inputArray[z]);
					}
				} 
			}
		}
		
		
		
	}

}
