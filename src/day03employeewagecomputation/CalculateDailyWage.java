package day03employeewagecomputation;

//Assume Wage per Hour is 20
//Assume Full Day Hour is 8

public class CalculateDailyWage {
	
	byte wagePerHour=20;
	byte fullDayHour=8;
	int totalWage=wagePerHour*fullDayHour;
	
	public static void main(String[] args) {
	
		EmployeesPresentAbsent presentEmployee = new EmployeesPresentAbsent();
		CalculateDailyWage wage = new CalculateDailyWage();

		
		System.out.println(" : Wage per Employee per Day :: "+wage.wagePerHour*wage.fullDayHour);
		System.out.println(" : Total Employees Present {Today} :: "+presentEmployee.present);
		System.out.println(" : Total Wage given to all {Today} :: "+wage.totalWage*presentEmployee.present);

		
		
	}

}
