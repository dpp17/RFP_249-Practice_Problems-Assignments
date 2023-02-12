package day21javaassignments.moodanalyzer;

import java.util.Scanner;

public class MoodAnalyzer {

	String moodAnalyzer(String message) throws MoodAnalyzerExceptions {
			if(message.contains("SAD")) {
				return "SAD";
			}else if(message.contains("HAPPY")) {
				return "HAPPY"; 
			}else {
				throw new MoodAnalyzerExceptions("Invalid Mood...");
			}
	}
	
	
	public static void main(String[] args) {
		
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		Scanner getInput = new Scanner(System.in);
		
		System.out.println("Tell me in one sentance what you feel :: ");
		System.out.println("========");
		try {
		System.out.println(moodAnalyzer.moodAnalyzer(getInput.next()));
		}catch(MoodAnalyzerExceptions e) {
			System.err.println(e);
			System.out.println("-- THATS A WEIRD MOOD --");
		}catch(Exception e) {
			System.err.println(e);
		}
		System.out.println("========");
		

	}
	
}
