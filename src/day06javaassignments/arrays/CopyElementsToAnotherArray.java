//Java Program to copy all the elements of an array into another array
package day06javaassignments.arrays;

public class CopyElementsToAnotherArray {

	public static void main(String[] args) {
		int[] sampleArray = {41,82,30,4,25,123,32,54,90,111};
		int[] firstClonedArray = (int[]) sampleArray.clone();
//original		
		System.out.print("::   Original Array :: [");
		for(int i=0;i<sampleArray.length;i++) {
		System.out.print(sampleArray[i]+" ");
		}System.out.println("]");
//1st Clone
		System.out.print(" First Cloned Array :: [");
		for(int i=0;i<sampleArray.length;i++) {
		System.out.print(firstClonedArray[i]+" ");
		}System.out.println("]");
//2nd clone
		int[] secondClonedArray = new int[sampleArray.length];
		
		System.err.print("Second Cloned Array :: [");
		for(int i=0;i<sampleArray.length;i++) {
			secondClonedArray[i]=sampleArray[i];
			System.out.print(secondClonedArray[i]+" ");
		}System.out.println("]");
	
	}
	
}
