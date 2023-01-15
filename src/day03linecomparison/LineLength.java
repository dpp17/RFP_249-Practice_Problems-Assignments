package day03linecomparison;

public class LineLength {

	
	public float lineLen(int x1, int y1,int x2,int y2) {
	
		float length= (float)(Math.sqrt( (Math. pow((x1-x2),2) + Math. pow((x1-x2),2)) ));
		
		return length;
	}
	
	public static void main(String[] args) {
		LineLength len = new LineLength();
		int numb1 = (int)(Math.random()*100);
		int numb2 = (int)(Math.random()*100);
		int numb3 = (int)(Math.random()*100);
		int numb4 = (int)(Math.random()*100);
		System.out.println("Lenth of Line with (x1,y1) & (x2,y2) Co-ordinates (cm):: "+len.lineLen(numb1, numb2, numb3, numb4));

	}

}
