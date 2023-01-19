//-----Java Program to left rotate the elements of an array
package day06javaassignments.arrays;

public class LeftRotateOfElementsOfArray {

	public static void main(String[] args) {
		
		int[] toBeRotateArray= {7,2,5,6,0,4,1};
//original		
		System.out.print("::    Original Array :: [");
		for(int i=0;i<toBeRotateArray.length;i++) {
		System.out.print(toBeRotateArray[i]+" ");
		}System.out.println("]");

//saving 1st element
		int tempContainer=toBeRotateArray[0];

//middle order rotation	
		for(int i=1;i<toBeRotateArray.length;i++) {
			toBeRotateArray[i-1]=toBeRotateArray[i];			
		}

//1st to last
		toBeRotateArray[toBeRotateArray.length-1]=tempContainer;

//Left_Rotated Array
		System.out.print("::Left_Rotated Array :: [");
		for(int i=0;i<toBeRotateArray.length;i++) {
		System.out.print(toBeRotateArray[i]+" ");
		}System.out.println("]");
		
	}

}
