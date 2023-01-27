package day08methodusedemployeewagecomputation;

public class PartTimeUsingSwitchCase {

	final byte wagePerHour=20;
	final byte partTimeHour=8 ;
	static int sum;
	
//Employees_Present
		
			final static int partTime=(int) (Math.random() * 10 + 1);
		
//part_time_wage		
		int wagePartTime() {
			 sum = wagePerHour * partTime;
			 return sum;
		}
//Display_wages
	void getWageDisplay(int partTime) {
		System.out.println("Total number of Part_Time working hour :: " + partTime);
		System.out.println("Total Wage_per_Day :: " + wagePartTime());
		System.out.println("Total Wage_per_Month :: " + wagePartTime() * 20);
	}
	
//main_method
	public static void main(String[] args) {
		PartTimeUsingSwitchCase partTimeUsingSwitchCase = new PartTimeUsingSwitchCase();
		
		System.out.println("Part_Time Hour :: " + partTime);
		switch(partTime) {
		case 2:
			partTimeUsingSwitchCase.getWageDisplay(partTime);
			break;
		case 3:
			partTimeUsingSwitchCase.getWageDisplay(partTime);
			break;
		case 4:
			partTimeUsingSwitchCase.getWageDisplay(partTime);
			break;
		case 5:
			partTimeUsingSwitchCase.getWageDisplay(partTime);
			break;
		case 6:
			partTimeUsingSwitchCase.getWageDisplay(partTime);
			break;
		case 7:
			partTimeUsingSwitchCase.getWageDisplay(partTime);
			break;
		case 8:
			partTimeUsingSwitchCase.getWageDisplay(partTime);
			break;
		default:
			System.out.println(" :: Invalid Working Hour ::");	
		}

	}

}
