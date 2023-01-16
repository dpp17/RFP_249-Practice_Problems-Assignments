package day03linecomparison;

public class LineLength {

	
	public float lineLen(byte x1, byte y1,byte x2,byte y2) {
	
		float length= (float)(Math.sqrt( (Math. pow((x1-x2),2) + Math. pow((y1-y2),2)) ));
		
		return length;
	}
	
	public static void main(String[] args) {
		LineLength len = new LineLength();
		byte numb1 = (byte)(Math.random()*100);
		byte numb2 = (byte)(Math.random()*100);
		byte numb3 = (byte)(Math.random()*100);
		byte numb4 = (byte)(Math.random()*100);
		System.out.println("Lenth of Line with (x1,y1) & (x2,y2) Co-ordinates (cm):: "+len.lineLen(numb1, numb2, numb3, numb4));

	}

}
