//Find 2nd Largest Number in an Array
package day03javaassignments;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
			
			byte[] givernArray = new byte[20];	//Array declared_and input given
				for(byte i = 0;i<givernArray.length;i++) {
					givernArray[i]=(byte)(Math.random()*100);
					System.out.println("givernArray["+i+"] :: "+givernArray[i]);
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
			
		System.out.println("The Second_Largest Number of Array is :: "+givernArray[1]);
			
		
		//Check the array elements(for reference)
		//	for(byte i=0;i<givernArray.length;i++) {
		//		System.out.println(givernArray[i]);
		//	}	
	}

}
