package day03employeewagecomputation;

public class CalculateWageForAMonth {

	public static void main(String[] args) {
		PartTimeWage part2 = new PartTimeWage();
		EmployeesPresentAbsent presentEmployee = new EmployeesPresentAbsent();
		CalculateDailyWage wage2 = new CalculateDailyWage();

		for(int i=1;i<=20;i++) {
			
			System.out.println("Wage on { Day-"+i+" } for  --> Part-Time :: "+ 
					part2.sum*i+"  --> Full_Time :: "+presentEmployee.present*i*wage2.totalWage+'\n');
	
		}

	}

}
