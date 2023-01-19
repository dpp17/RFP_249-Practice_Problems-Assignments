package day05javaassignments;

import java.util.Scanner;

public class EuclideanDistanceByUserInput {

	public static void main(String[] args) {
		
		Scanner getInputCoordinates = new Scanner(System.in);
//x-Co_Ordinate			
		System.out.println(": Enter x-Co_Ordinate :");
		int pointX=getInputCoordinates.nextInt();
//y-Co_Ordinate		
		System.out.println(": Enter y-Co_Ordinate :");
		int pointY=getInputCoordinates.nextInt();	
		System.out.println("::: CALCULATING DISTANCE FROM (x,y) TO (0,0) :::");
//distance		
		double euclideanDistance=Math.sqrt((pointX*pointX)+(pointY*pointY));
		
		System.out.println(": Distance from (x,y) to (0,0)  ::"+euclideanDistance+" units");
	}

}
