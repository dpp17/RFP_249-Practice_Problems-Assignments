package day05javaassignments;

import java.util.Scanner;

public class AlphabetIsVowelOrConsonant {

	public static void main(String[] args) {
		
		Scanner getInputAlphabet = new Scanner(System.in);
		boolean loopExecutioner=false;
		
		do {
//taking userInput			
			System.out.println("--->> Enter a Alphabet :: ");
			char userGivenAlphabet=getInputAlphabet.next().charAt(0);
//printing input			
			System.out.println(":::  Your User Input  : "+userGivenAlphabet+" :::"+'\n');
//check if alphabet	in UPPER case		
			if (userGivenAlphabet>=65 && userGivenAlphabet<=90) {
//check if in vowel			
				if(userGivenAlphabet=='A' || userGivenAlphabet=='E' || userGivenAlphabet=='I' || userGivenAlphabet=='O' || userGivenAlphabet=='U') {
					System.out.println("-----  Vowel input :: '"+userGivenAlphabet+"' -----");
					loopExecutioner=false;
//if in consonant	
				}else {
					System.out.println(":: Given Input is a -- Consonant  ::");
					loopExecutioner=false;
				}
//check if alphabet	in LOWER case
			}else if (userGivenAlphabet>=97 && userGivenAlphabet<=122) {
//check if in vowel		
				if(userGivenAlphabet=='a' || userGivenAlphabet=='u' || userGivenAlphabet=='o' || userGivenAlphabet=='i' || userGivenAlphabet=='e') {
					System.out.println("-----  Vowel input :: '"+userGivenAlphabet+"' -----");
					loopExecutioner=false;
//if in consonant
				}else {
					System.out.println(":: Given Input is a -- Consonant  ::");
					loopExecutioner=false;
				}
//OTHER THAN ALPHABET INPUT			
			}else {
				System.out.println("::: Invalid Input { Hint: ENTER ALPHABETS 'ONLY' } :::");
				loopExecutioner=true;
			}
//REPEAT IF OTHER THAN ALPHABETS			
		}while(loopExecutioner==true);	

	}

}
