package day08methodusedemployeewagecomputation;
//print_statement changed,totalwage_at the end of month for both
public class CalculateWageForAMonth extends CalculateDailyWage{
	
	final byte fullDayHour = 8;
	final byte wagePerHour = 20;
	final byte partTimeHour = 8 ;
	static int present, sum, totalWage, perDayWage, partTimeTotal = 0,
				fullTimeTotal = 0, partTotal=0;
	
//Employees_Present
		byte isPresent() {
			present=(int) (Math.random()*10 + 1);
			return (byte) present;
		}
		
//Total_Employees_Present
		void gettingWagePerEmployee() {
			perDayWage = wagePerHour * fullDayHour;
		}
//Total_wage_for_all_for_Today
			void gettingWageForToday() {
				 totalWage = wagePerHour * fullDayHour * this. isPresent();
		}
//part_time_wage		
		int wagePartTime() {
			 sum = wagePerHour * partTimeHour;
			 return sum;
		}
//Total_Of_Monthly_Part_Time		
		int partTimeTotal (int num) {
			partTotal = partTotal + num;
			return partTotal;
		}
//Wage_as_per_Days
		int getWagePerDay() {
			for(int i = 1; i <= 20; i++) {
				System. out. println("ToTal Wage on { Day-" + i + " } for  --> Part-Time :: " + 
						this.wagePartTime() * i + "  -->Total Full_Time :: " + (this. isPresent() * i * totalWage));
				//Part_time_total
				this.partTimeTotal(this.wagePartTime() * i);
				
				 fullTimeTotal = fullTimeTotal + this. isPresent() * i * totalWage;	 
			}
			return fullTimeTotal;		
		}

	public static void main(String[] args) {
		CalculateWageForAMonth calculateWageForAMonth = new CalculateWageForAMonth();
	
		calculateWageForAMonth.gettingWagePerEmployee();
		calculateWageForAMonth.gettingWageForToday();
		calculateWageForAMonth.wagePartTime();
		calculateWageForAMonth.getWagePerDay();
	
		System.out.println('\n' + "Total Wage given to Part_Time Employees till the end of month  ::  " + partTotal);
		System.out.println("Total Wage given to Full_Time Employees till the end of month  ::  " + fullTimeTotal);
		
	}

}
