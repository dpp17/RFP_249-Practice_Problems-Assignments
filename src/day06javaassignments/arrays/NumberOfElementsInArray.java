//----Program to find number of elements in an array
package day06javaassignments.arrays;

public class NumberOfElementsInArray {

	public static void main(String[] args) {
		int[] toPrint= {12,23,21,34,56,13,61,46,58,12,5,57,23,41,242,3,1}; 
//Direct_method
		System.out.println("Length of array ::"+toPrint.length);	//length of the array
		
//Using For_each		
		int count=0;
		for (int num:toPrint) {
			count++;		
		}
		System.out.println("length ::"+count);
	}
}
