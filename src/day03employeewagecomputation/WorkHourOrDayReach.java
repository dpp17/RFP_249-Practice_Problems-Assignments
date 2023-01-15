package day03employeewagecomputation;

public class WorkHourOrDayReach {

	
	
	public float meth() {
	float day =0f;	
	for(int i =1;i<=100;i++)
	{
		
		i=i+1;
		if(i%8==0) {
			 day=day+1;
		}else {
			day=day+0;
		}
		
		
	}
	System.out.println(day);
	return day;
	}
	public static void main(String[] args) {
//		PartTimeWage part3 = new PartTimeWage();
//		EmployeesPresentAbsent presentEmployee3 = new EmployeesPresentAbsent();
//		CalculateDailyWage wage3 = new CalculateDailyWage();
WorkHourOrDayReach obj = new WorkHourOrDayReach();

	System.out.println(obj.meth() < 20 ? "Total Working Hour Reached First":"Total Working Days Reached First.");
	}

}
