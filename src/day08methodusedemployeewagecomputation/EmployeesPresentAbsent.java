package day08methodusedemployeewagecomputation;
//changed no_of_employee_present_absent-present_absent_only
public class EmployeesPresentAbsent {
	
	static int present;
	static int absent;
	
	byte isPresent() {
		present=(int) (Math.random()*10);
		return (byte) present;
	}
	
	byte isAbsent() {
		absent=(int) (Math.random()*10);
		return (byte) absent;
	}
	
	public static void main(String[] args) {
		
		EmployeesPresentAbsent attendance = new EmployeesPresentAbsent();
		
		if(attendance.isPresent() %2==0 && attendance.isPresent()!=0) {
			
					System.out.println(": employee is Present :");
					
		}else {
					System.out.println(": employee is absent :");
		}
		
		
	}
}
