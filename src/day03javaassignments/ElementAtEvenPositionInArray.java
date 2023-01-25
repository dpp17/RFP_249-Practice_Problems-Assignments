//Java Program to print the elements of an array present on an even position
package day03javaassignments;

public class ElementAtEvenPositionInArray {

	public static void main(String[] args) {
		System.out.println(" ::  Elements At Even Position  :: ");
		byte[] givernArray = new byte[20];	//Array declared_and input given
		for(byte i = 0;i<givernArray.length;i++) {
				givernArray[i]=(byte)(Math.random()*100);
				if(i%2==0) {
					System.out.println("givernArray["+i+"] :: "+givernArray[i]);
				}
		}
		

	}

}
