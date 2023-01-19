package day05javaassignments;

import java.util.Scanner;

public class PercentageOfHeadsAndTails {
void isFlippingCoin() {

}
	public static void main(String[] args) {
		
		Scanner inputNumber = new Scanner(System.in);
		System.out.println(" Enter the Number of times coin will flip :: ");
		int numberOfFlips=inputNumber.nextInt();	//number of flips is taken

		int countHeads=0;
		int countTails=0;
		for(int i=1; i<=numberOfFlips;i++) {	
					double randomCoinFlips = Math.random();	
					
					if (randomCoinFlips>=0.5) {
						countHeads++;
					}else {
						countTails++;
					}
		}
		System.out.println("head  "+countHeads);		//number of times head came
		System.out.println("tails  "+countTails);		//number of times tail came
		
		double headPercentage=((countHeads*100)/(countHeads+countTails));	//Head %age
		double tailPercentage=((countTails*100)/(countHeads+countTails));	//Tail &age
		
		System.out.println("Head Percentage after "+numberOfFlips+" flips :: "+headPercentage+" %");
		System.out.println("Tail Percentage after "+numberOfFlips+" flips :: "+tailPercentage+" %");
	}

}
