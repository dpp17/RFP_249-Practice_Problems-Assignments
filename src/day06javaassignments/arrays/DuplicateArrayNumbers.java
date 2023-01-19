//-----Program to find duplicate elements of an array
package day06javaassignments.arrays;

public class DuplicateArrayNumbers {

	public static void main(String[] args) {
		//Random input
		byte[] numberArray = new byte[20];
		for(byte i = 0;i<numberArray.length;i++) {
			numberArray[i]=(byte)(Math.random()*10);
		//	System.out.println("numberArray["+i+"] :: "+numberArray[i]);	//Review_purpose
		}
		
		//Values Defined in program only
		//	byte[] numberArray = new byte[] {1,2,3,0,4,0,4,1,2,1};
		
		byte[] freq = new byte[numberArray.length] ;
		byte visited=-1; //will be use to recognize elements being visited before

		for (byte i=0;i<numberArray.length;i++) {
			byte count=1;
			for(byte j=(byte)(i+1);j<numberArray.length;j++) {
				if(numberArray[i]==numberArray[j]) {
					count++;
					freq[j]=visited;//duplication limiter
				}
			}
			
			//if element not visited then,
				if(freq[i]!=visited) {
				freq[i]=count;
				}
		}
		System.out.println(" : Element  ::::  Frequency :");
		for(byte z=0;z<freq.length;z++) {
			if(freq[z]!=visited) {
				if(freq[z]>1) {
				System.out.println("       "+numberArray[z]+"     ::      "+freq[z]);
				}
			}
		}

	}
}
