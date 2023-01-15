package day03employeewagecomputation;
//data_type_change
public class WorkHourOrDayReach {

	
	
	public byte meth() {
	byte day =0;	
	for(int i =1;i<=100;i++)
	{
		i=i+1;
		if(i%8==0) {
			 day=(byte)(day+1);
		}else {
			day=(byte)(day+0);
		}
	}
	System.out.println(day);
	return day;
	}
	
	public static void main(String[] args) {

		WorkHourOrDayReach obj = new WorkHourOrDayReach();

	System.out.println(obj.meth() < 20 ? "Total Working Hour Reached First":"Total Working Days Reached First.");
	}

}
