//-----Java Program to reverse an array
package day06javaassignments.arrays;

public class ReverseOrderArray {

	public static void main(String[] args) {
		
		byte[] givenArray = new byte[5];	//Array declared as main_Array
		byte[] reverseArray= new byte[givenArray.length]; //to store values to make ReverseArray of main_Array
		
//assigning random values to the array
		System.out.print("givernArray[i] :: [ ");
		for(byte i = 0;i<givenArray.length;i++) {
				givenArray[i]=(byte)(Math.random()*100);				
		System.out.print(givenArray[i]+" ");
		}System.out.println("]");
		
//reversing the array 
		for(byte i=0; i<givenArray.length; i++) {
			reverseArray[(givenArray.length-1)-i]=givenArray[i];
		}
		
//printing the reverse array
		System.out.print("ReverseArray[i] :: [ ");
		for(byte i=0; i<givenArray.length; i++) {
			System.out.print(reverseArray[i]+" ");
		}System.out.println("]");
	}
}
