package day03employeewagecomputation;

public class PartTimeWage {
	//int total=sum;
	final byte wagePerHour=20;
	final int partTimeHour=8 ;
	int partTimeEmployee=(int)(Math.random()*100);
	int sum=wagePerHour*partTimeEmployee*partTimeHour;
	
	public static void main(String[] args) {
		
		PartTimeWage part = new PartTimeWage();
		
		System.out.println(" : Part_Time Hour per Day :: "+part.partTimeHour);
		System.out.println(" : Total Number of Pat_Time Employee per Day :: "+part.partTimeEmployee);
		System.out.println(" : Total Wage of Part_Time Employees per Day :: "+part.sum);
	}

}
