//-----Java Program to Add the elements of an Array
package day06javaassignments.arrays;

public class AddElementsOfAnArray {

	public static void main(String[] args) {
		
		int[] toSumArray = {12,32,4,53,5,1,76,23,1,54,86,76,54,12,456,34,24,53,6};
//original Array	
		int sum=0;
		System.out.print(": Given Array :: [ ");
		for(int i=0;i<toSumArray.length;i++) {

			sum=sum+toSumArray[i];	//adding_elements
			
			System.out.print(toSumArray[i]+" ");
		}System.out.println("]");
//Sum
		System.out.println("Sum of the given Array :: "+sum);
	
	}

}
