package day03employeewagecomputation;
//print_statement changed,totalwage_at the end of month for both
public class CalculateWageForAMonth {

	public static void main(String[] args) {
		PartTimeWage part2 = new PartTimeWage();
		EmployeesPresentAbsent presentEmployee = new EmployeesPresentAbsent();
		CalculateDailyWage wage2 = new CalculateDailyWage();
		
		int partTimeTotal=0,fullTimeTotal=0;
		for(int i=1;i<=20;i++) {
			
			System.out.println("ToTal Wage on { Day-"+i+" } for  --> Part-Time :: "+ 
					part2.sum*i+"  -->Total Full_Time :: "+(presentEmployee.present*i*wage2.totalWage));
			partTimeTotal=partTimeTotal+part2.sum*i;
			fullTimeTotal=fullTimeTotal+presentEmployee.present*i*wage2.totalWage;
		}

		System.out.println('\n'+"Total Wage given to Part_Time Employees till the end of month  ::  "+partTimeTotal);
		System.out.println("Total Wage given to Full_Time Employees till the end of month  ::  "+fullTimeTotal);
		
	}

}
