package day03employeewagecomputation;

public class PartTimeUsingSwitchCase {

	public static void main(String[] args) {
		CalculateDailyWage wage3 = new CalculateDailyWage();
		byte partTime=(byte)(Math.random()*10);
		
		System.out.println("Part_Time Hour :: "+partTime);
		switch(partTime) {
		case 2:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wage3.wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wage3.wagePerHour*partTime*20);
			break;
		case 3:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wage3.wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wage3.wagePerHour*partTime*20);
			break;
		case 4:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wage3.wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wage3.wagePerHour*partTime*20);
			break;
		case 5:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wage3.wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wage3.wagePerHour*partTime*20);
			break;
		case 6:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wage3.wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wage3.wagePerHour*partTime*20);
			break;
		case 7:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wage3.wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wage3.wagePerHour*partTime*20);
			break;
		case 8:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wage3.wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wage3.wagePerHour*partTime*20);
			break;
		default:
			System.out.println(" :: Invalid Working Hour ::");	
		}

	}

}
