package day08methodusedemployeewagecomputation;
//data_type_change
public class WorkHourOrDayReach {

	
	
	public byte checkTotalWorkingDaysOrHours() {
	byte day =0;	
	for(int i = 1; i <= 100; i++)
	{
		//i = i + 1;
		
		if(i % 8 == 0) {
			 day = (byte)(day + 1);
		}else {
			day = (byte)(day + 0);
		}
	}
	System.out.println(" Reached 100 hours in:: " + day + " days. " + "\n");
	return day;
	}
	
	public static void main(String[] args) {

		WorkHourOrDayReach workHourOrDayReach = new WorkHourOrDayReach();

		System.out.println(workHourOrDayReach.checkTotalWorkingDaysOrHours() < 20 ? " Total Working Hour Reached First":" Total Working Days Reached First.");
	}
}
