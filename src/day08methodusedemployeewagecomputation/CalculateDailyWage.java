package day08methodusedemployeewagecomputation;

//Assume Wage per Hour is 20
//Assume Full Day Hour is 8

public class CalculateDailyWage {
	
	static final byte wagePerHour=20;
	static final byte fullDayHour=8;
	 int totalWage, perDayWage;
	static int present;
	
//Employees_Present
	byte isPresent() {
		present=(int) (Math.random()*10);
		return (byte) present;
	}
	
//Total_Employees_Present
	void gettingWagePerEmployee() {
		perDayWage = wagePerHour * fullDayHour;
	}
	
//Total_wage_for_all_for_Today
	void gettingWageForToday() {
		totalWage = wagePerHour * fullDayHour * isPresent();
	}
	
//Main_method
	public static void main(String[] args) {
	
		CalculateDailyWage wage = new CalculateDailyWage();
		wage.gettingWagePerEmployee();
		wage.gettingWageForToday();
		
		System.out.println(" : Wage per Employee per Day :: " + wage.perDayWage);
		System.out.println(" : Total Employees Present {Today} :: " + wage.isPresent());
		System.out.println(" : Total Wage given to all {Today} :: "+ wage.totalWage);

		
		
	}

}
