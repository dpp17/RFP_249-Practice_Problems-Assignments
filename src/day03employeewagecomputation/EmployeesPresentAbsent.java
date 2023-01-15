package day03employeewagecomputation;

public class EmployeesPresentAbsent {
	
	int present = (int) (Math.random()*1000);
	int absent = (int) (Math.random()*1000);
	
	public static void main(String[] args) {

//		int present = (int) (Math.random()*1000);
//		int absent = (int) (Math.random()*1000);

		EmployeesPresentAbsent employee = new EmployeesPresentAbsent();
		
		System.out.println(": Number of Employees Present :: "+ employee.present);
		System.out.println(": Number of Employees Absent :: "+employee.absent);
		
	}
}
