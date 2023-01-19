/*

Simulate Stopwatch Program
a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.

 */
package day06javaassignments.logicalprograming;

import java.util.Scanner;

public class StimulateStopwatchProgram {


	public static void main(String[] args) {
		
		Scanner getUserInput = new Scanner(System.in);
		
		System.err.print("start");
		byte startClick=getUserInput.nextByte();
		double startTimer=System.currentTimeMillis();	//This shows time in milliseconds
		
		System.err.println("end");
		byte endClick=getUserInput.nextByte();
		double endTimer=System.currentTimeMillis();
		
		double timeTaken=(endTimer-startTimer)/1000;
		
		System.out.println(":  Time take  :: "+timeTaken);

	}

}
