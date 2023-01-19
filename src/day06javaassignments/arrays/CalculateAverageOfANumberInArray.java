//Java Program to Calculate average of numbers using Array
package day06javaassignments.arrays;

public class CalculateAverageOfANumberInArray {

	public static void main(String[] args) {
		
		int lengthOfArray=(int)(Math.random()*10);
		int[] averageArray= new int[lengthOfArray] ;
		float sum=0;
		for (int i=0;i<averageArray.length;i++) {
			int elementsOfArray=(int)(Math.random()*100);
			averageArray[i]=elementsOfArray;
				sum=sum+averageArray[i];
		}
//print_Array
		System.out.print("Random_Array :: [ ");
		for(int i=0;i<averageArray.length;i++) {
			System.out.print(averageArray[i]+" ");
		}System.out.println("]");
//Print_length and Average
		System.out.println("Array Length :: "+averageArray.length); 
		System.out.println("Average of Array :: "+sum/averageArray.length); 
	}

}
