//-----Java Program to convert char Array to String
package day06javaassignments.arrays;

public class ConvertCharArrayToString {

	public static void main(String[] args) {
		
		char[] characterArray = {'B','R','I','D','G','E','L','A','B','Z'};
		String storeTempString="" ;
		
		System.out.print("Given Array :: [ ");
		for(int i=0;i<characterArray.length;i++) {
		
			storeTempString=storeTempString+characterArray[i];	//adding string with array's characters one by one
			
			System.out.print(characterArray[i]+" ");
		}System.out.println("]");
		
		System.out.println(": Converted String :: "+storeTempString);

	}

}
