package day03employeewagecomputation;
//changed no_of_employee_present_absent-present_absent_only
public class EmployeesPresentAbsent {
	
	int present = (int) (Math.random()*10);
	int absent = (int) (Math.random()*10);
	
	public static void main(String[] args) {


		EmployeesPresentAbsent employee = new EmployeesPresentAbsent();
		if(employee.present%2==0 && employee.present!=0) {
		System.out.println(": Employee is Present :");
		}else {
			System.out.println(": Employee is absent :");
		}
	}
}
