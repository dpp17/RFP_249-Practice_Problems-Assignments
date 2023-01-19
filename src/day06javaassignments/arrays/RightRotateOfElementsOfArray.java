//-----Java Program to right rotate the elements of an array
package day06javaassignments.arrays;

public class RightRotateOfElementsOfArray {

	public static void main(String[] args) {
		
		int[] toBeRotateArray= {7,2,5,6,0,4,1};
//original		
		System.out.print("::    Original Array :: [");
		for(int i=0;i<toBeRotateArray.length;i++) {
		System.out.print(toBeRotateArray[i]+" ");
		}System.out.println("]");
	
//saving last element		
		int tempContainer=toBeRotateArray[toBeRotateArray.length-1];

//middle order rotation
		for(int i=toBeRotateArray.length-1;i>0;i--) {
			toBeRotateArray[i]=toBeRotateArray[i-1];			
		}

//last in 1st
		toBeRotateArray[0]=tempContainer;
		
//Right_Order Rotation
		System.out.print("::Right_Rotated Array :: [");
		for(int i=0;i<toBeRotateArray.length;i++) {
		System.out.print(toBeRotateArray[i]+" ");
		}System.out.println("]");

	}

}
