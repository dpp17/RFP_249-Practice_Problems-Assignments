//Java Program to print the elements of an array
package day03javaassignments;

public class PrintArrayElements {

	public static void main(String[] args) {
		
		byte[] numberArray = new byte[] {31,12,53,14,95,56,37,18};

		for(byte i=0;i<numberArray.length;i++) {
			System.out.println("Element of Array at {"+i+"} position :: "+numberArray[i]);
		}
		
	}

}
