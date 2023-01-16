package day03linecomparison;

public class EqualityOfTwoLines {

	
	public float lineLen(byte x1, byte y1,byte x2,byte y2) {
		
		float length= (float)(Math.sqrt( (Math. pow((x1-x2),2) + Math. pow((y1-y2),2)) ));
		
		return length;
	}
	
	public static void main(String[] args) {
		EqualityOfTwoLines len = new EqualityOfTwoLines();
		EqualityOfTwoLines len1 = new EqualityOfTwoLines();
		byte numb1 = (byte)(Math.random()*100);
		byte numb2 = (byte)(Math.random()*100);
		byte numb3 = (byte)(Math.random()*100);
		byte numb4 = (byte)(Math.random()*100);
		byte numb5 = (byte)(Math.random()*100);
		byte numb6 = (byte)(Math.random()*100);
		byte numb7 = (byte)(Math.random()*100);
		byte numb8 = (byte)(Math.random()*100);
		
		float lengthOne =len.lineLen(numb1, numb2, numb3, numb4) ;
		float lengthTwo =len1.lineLen(numb5, numb6, numb7, numb8) ;
		
		System.out.println("Lenth of Line with (x1,y1) & (x2,y2) Co-ordinates (cm):: "+lengthOne);
		System.out.println("Lenth of Line with (x3,y3) & (x4,y4) Co-ordinates (cm):: "+lengthTwo);
		
		System.out.println("Are The Lines Equal :: "+(len1.equals(len)));
	
		// System.out.println(lengthOne==lengthTwo ? " :: Lines Are Equal :: ":" :: Lines Are Not Equal :: ");

	}

}
