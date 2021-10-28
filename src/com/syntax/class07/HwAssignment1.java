package com.syntax.class07;

public class HwAssignment1 {

	public static void main(String[] args) {
		/*
		 * to calculate sum of all even and all odd numbers from 1 to 100
		 */
		System.out.print("SUM OF ODD NUMBERS ");
			int sum1=0;
			int sum2=0;
		
			for(int i=1;	i<=100;	i+=2) {
				sum1+=i;
				System.out.print(sum1+" ");	
			
			}
			System.out.println();
			System.out.print("SUM OF EVEN NUMBERS ");
			for(int i=2;	i<=100;	i+=2) {
				sum2+=i;
				System.out.print(sum2+" ");
			}
				

	}

}
