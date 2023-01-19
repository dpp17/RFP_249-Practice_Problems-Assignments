//Java Program to sort the elements of an array in ascending order 
package com.bridgelabz.daythreeprac;

public class SortArrayInAscendingOrder {

	public static void main(String[] args) {
		
		byte[] givenArray = new byte[20];	//Array declared_and input given
			for(byte i = 0;i<givenArray.length;i++) {
					givenArray[i]=(byte)(Math.random()*100);
			System.out.println("givenArray["+i+"] :: "+givenArray[i]);
			}
		
		//byte[] givenArray = new byte[] {1,3,2,4,5,1};	//for_Code_testing_purpose
		byte min=0;
		
		for(byte i=0;i<givenArray.length;i++) {
			for(byte j=(byte)(i+1);j<givenArray.length;j++) {
				if (givenArray[i]>givenArray[j]) {
						min=givenArray[i];
						givenArray[i]=givenArray[j];
						givenArray[j]=min;
				}
			}
		}
		
		//printing sorted Array
		for(byte i = 0;i<givenArray.length;i++) {
				System.out.println("givenArray["+i+"] :: "+givenArray[i]);
		}

	}

}
