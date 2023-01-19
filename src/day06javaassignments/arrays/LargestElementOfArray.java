//-----Program to find largest element of an array
package day06javaassignments.arrays;

public class LargestElementOfArray {

	public static void main(String[] args) {
		
		byte[] givernArray = new byte[20];	//Array declared_and input given
		System.out.print("givernArray[i] :: [ ");
		for(byte i = 0;i<givernArray.length;i++) {
				givernArray[i]=(byte)(Math.random()*100);
		System.out.print(givernArray[i]+" ");
		}
	
	//byte[] givernArray = new byte[] {1,3,2,4,5,1};	//for_Code_testing_purpose
	byte max=0;
	
	for(byte i=0;i<givernArray.length;i++) {
		for(byte j=(byte)(i+1);j<givernArray.length;j++) {
			if (givernArray[i]<givernArray[j]) {
					max=givernArray[i];
					givernArray[i]=givernArray[j];
					givernArray[j]=max;
			}
		}
	}
		System.out.println("]");
		System.out.println("The Largest Element of Array is :: "+givernArray[0]);
	}

}
