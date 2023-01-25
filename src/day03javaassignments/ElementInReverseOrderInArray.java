//Java Program to print the elements of an array in reverse order
package day03javaassignments;

public class ElementInReverseOrderInArray {

	public static void main(String[] args) {
		
		byte[] givernArray = new byte[5];	//Array declared as main_Array
		byte[] reverseArray= new byte[givernArray.length]; //to store values to make ReverseArray of main_Array
		
//assigning random values to the array
		for(byte i = 0;i<givernArray.length;i++) {
				givernArray[i]=(byte)(Math.random()*100);				
		System.out.println("givernArray["+i+"] :: "+givernArray[i]);
		}
		
//reversing the array 
		for(byte i=0; i<givernArray.length; i++) {
			reverseArray[(givernArray.length-1)-i]=givernArray[i];
		}
		
//printing the reverse array
		for(byte i=0; i<givernArray.length; i++) {
			System.out.println("ReverseArray["+i+"] = "+reverseArray[i]);
		}
		
	}

}
