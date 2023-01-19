//-----Java Program to print the elements of an array present on odd Position
package day06javaassignments.arrays;

public class OddPositionElementsInArray {

	public static void main(String[] args) {
		System.out.println(" ::  Elements At Odd Position  :: ");
		int[] givernArray = new int[20];	//Array declared_and input given
		
		for(int i = 0;i<givernArray.length; i++) {
				givernArray[i]=(byte)(Math.random()*100);
				if(i%2!=0) {
					System.out.println("givernArray["+i+"] :: "+givernArray[i]);
				}
		}

	}
}
