package day05javaassignments;

import java.util.Scanner;

public class WindChillEffecticeTemperature {

	public static void main(String[] args) {
		
		Scanner getWeatherValue = new Scanner(System.in);
//	temperature t (in Fahrenheit)	
		System.out.println(": Enter temperature t (in Fahrenheit) :");
		int temperatureInFahrenheit=getWeatherValue.nextInt();
//wind Speed
		System.out.println(": Enter wind speed v (in miles per hour) :");
		int windSpeed=getWeatherValue.nextInt();
//Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3		
		if(temperatureInFahrenheit<50 && windSpeed>3 && windSpeed<120) {
			
				double effectiveTemperature=(35.74 + 0.6215*temperatureInFahrenheit + (0.4275*temperatureInFahrenheit - 35.75))*(Math.pow(windSpeed, 0.16));
				
				System.out.println(": National Weather Service defines the effective temperature (the wind chill) :: "+effectiveTemperature);
		}else {
			System.out.println(":: Note: the formula is not valid if temperature is larger than 50 in absolute value or if wind speed is larger than 120 or less than 3  ::");
		}
	}

}
