//-----Java Program to sort an array in ascending order
package day06javaassignments.arrays;

public class SortArrayInAscendingOrder {

	public static void main(String[] args) {
		
		
		byte[] givenArray = new byte[20];	//Array declared_and input given
System.err.print("given_Array[i] :: [ ");	
		for(byte i = 0;i<givenArray.length;i++) {
					givenArray[i]=(byte)(Math.random()*100);
			System.out.print(givenArray[i]+" ");
			}
		
		//byte[] givenArray = new byte[] {1,3,2,4,5,1};	//for_Code_testing_purpose
		byte min=0;
		
		for(byte i=0;i<givenArray.length;i++) {
			for(byte j=(byte)(i+1);j<givenArray.length;j++) {
				if (givenArray[i]>givenArray[j]) {
						min=givenArray[i];
						givenArray[i]=givenArray[j];
						givenArray[j]=min;
				}
			}
		}
		
		System.err.println("]");
		System.out.print("sorted_Array[i] :: [ ");
		//printing sorted Array
		for(byte i = 0;i<givenArray.length;i++) {
				System.err.print(givenArray[i]+" ");
		}
System.err.println("]");
	}

}
