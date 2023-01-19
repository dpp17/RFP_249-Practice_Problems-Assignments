/*
---> Factors
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.
*/
package day05javaassignments;


public class ComputeFactorsAndPrimeFactors {

//check primeFactors	
		static void getPrimeFactors(int i) {
		int count=0;
		for(int j=i;j>0;j--) {
			if (i%j==0) {
				count++;
			}
		}
																		//System.out.println("count"+count);
		if(count==2) {
			System.out.println("Prime factors:"+i);
		}
	}
	
//main_method	
	public static void main(String[] args) {
																		//int checkingProgram=60;
		
		int checkRandomNumber=(int)(Math.random()*100);
		
		for (int i=1;i*i<=checkRandomNumber;i++) {
			if(checkRandomNumber%i ==0) {
													//System.out.println("factor:"+i);
				getPrimeFactors(i);						
				//ComputeFactorsAndPrimeFactors.getPrimeFactors(i);      //calling method using class_name
		}

	}
	}
}

