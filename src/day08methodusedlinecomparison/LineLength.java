package day08methodusedlinecomparison;

public class LineLength {

	byte number;
	//generate_number ::
			byte generateNumber() {
				number = (byte)(Math.random()*100);
			return number;
			}
		
	
		float lineLen(byte x1, byte y1,byte x2,byte y2) {
	
			float length= (float)(Math.sqrt( (Math. pow((x1-x2),2) + Math. pow((y1-y2),2)) ));
		return length;
		}
		
//main_method
public static void main(String[] args) {
		LineLength len = new LineLength();
		
		float lineOne = len.lineLen(len.generateNumber(), len.generateNumber(), len.generateNumber(), len.generateNumber());
		
		System.out.println("Lenth of Line with (x1,y1) & (x2,y2) Co-ordinates (cm):: " + lineOne);

		
	}
}
