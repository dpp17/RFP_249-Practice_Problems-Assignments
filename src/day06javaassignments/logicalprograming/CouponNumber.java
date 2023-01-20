package day06javaassignments.logicalprograming;

public class CouponNumber {
	static int couponNumber=0;
	static void luckyDraw() {
		int[] secretCoupon=new int[5];
		int couponNumber=0;
		do {
			couponNumber=(int)(Math.random()*1000000);
		}while(couponNumber<=9999 || couponNumber>99999);
	
			System.out.print(":: Your Coupon number :: ");	
			for(int i = 4;i>=0;i--) {
				secretCoupon[i]=couponNumber%10;
				couponNumber=couponNumber/10;
				System.out.print(secretCoupon[i]+" ");
		}System.out.println('\n');
			
	}
	public static void main(String[] args) {
		
		luckyDraw();
		if(45000<=couponNumber && couponNumber<=46500) {
			System.out.println(":: CONGRATULATIONS ---- YOU WON A 6 WEEK CODING ASSIGNMENTS : 5555 ARRAY AND PATTERN QUESTIONS : ---- ::");
		}
		else {
			System.out.println(":: ---- :: ----- BETTER LUCK NEXT TIME ----- :: ---- ::");
		}
		
		
	}

}
