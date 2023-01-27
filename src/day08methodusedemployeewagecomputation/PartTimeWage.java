package day08methodusedemployeewagecomputation;
//changed data_type,modular_changed_to decrease_part_time_employee
public class PartTimeWage {
	
	//int total=sum;
	final byte wagePerHour=20;
	final byte partTimeHour=8 ;
	final int partTimeEmployee=(int)(Math.random()*10 + 1);
	int sum, present ;
	
	//Employees_Present
		byte isPresent() {
			this.present=(int) (Math.random()*10);
			return (byte) this.present;
		}
	
		void wageAddition() {
			 this.sum = this.wagePerHour * this.partTimeHour;
		}

//main_method
public static void main(String[] args) {
		
		PartTimeWage part = new PartTimeWage();
		
		part.wageAddition();
		
		System.out.println(" : Part_Time Hour per Day :: " + part.partTimeHour);
		System.out.println(" : Total Number of Pat_Time Employee per Day :: " + part.partTimeEmployee);
		System.out.println(" : Total Wage of Part_Time Employees per Day :: " + part.sum * part.partTimeEmployee );
	}
}
