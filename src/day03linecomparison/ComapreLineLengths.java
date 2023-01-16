package day03linecomparison;

public class ComapreLineLengths {

byte r;
	
	public float lineLen(byte x1, byte y1,byte x2,byte y2) {
		
		float length= (float)(Math.sqrt( (Math. pow((x1-x2),2) + Math. pow((y1-y2),2)) ));
		
		return length;
	}
	
	public static void main(String[] args) {
		EqualityOfTwoLines len = new EqualityOfTwoLines();
		
		byte numb1 = (byte)(Math.random()*100);
		byte numb2 = (byte)(Math.random()*100);
		byte numb3 = (byte)(Math.random()*100);
		byte numb4 = (byte)(Math.random()*100);
		byte numb5 = (byte)(Math.random()*100);
		byte numb6 = (byte)(Math.random()*100);
		byte numb7 = (byte)(Math.random()*100);
		byte numb8 = (byte)(Math.random()*100);
		
		String s1=Float.toString(len.lineLen(numb1, numb2, numb3, numb4));
		String s2=Float.toString(len.lineLen(numb5, numb6, numb7, numb8));
		System.out.println("Lenth of Line{1} with (x1,y1) & (x2,y2) Co-ordinates (cm):: "+s1);
		System.out.println("Lenth of Line{2} with (x3,y3) & (x4,y4) Co-ordinates (cm):: "+s2);
		System.out.println(s1.compareTo(s2)==0 ? " :: Lines Are Equal :: ":s1.compareTo(s2)>0 ?" :: Line{1} is greater than Line{2}  :: ":" :: Line{2} is greater than Line{1}  :: ");
		
	
		//	System.out.println(lengthOne==lengthTwo ? " :: Lines Are Equal :: ":lengthOne>lengthTwo ?" :: Line{1} is greater than Line{2}  :: ":" :: Line{2} is greater than Line{1}  :: ");
	}
}
