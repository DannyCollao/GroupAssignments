package com.syntax.class05;

import java.util.Scanner;

public class HwAssignment2_1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);

		int a, b, c;
		int sum=0, average=0;
		
		System.out.println("\n");
		System.out.println("\tFinal Grade Average from Quizes, Mid Term, and Final Grade");
		System.out.println("\n");
		System.out.print("\tEnter Quiz grade : ");
		a = input.nextInt();
		System.out.print("\tEnter Mid Term grade : ");
		b = input.nextInt();
		System.out.print("\tEnter Final grade : ");
		c = input.nextInt();
		
		sum = (a+b+c);
		average = (sum/3);
		
		System.out.println("\n");
		System.out.println("\tThe Final Grade Average is " +average);
		System.out.println("\n");
	
		
		if (average >= 90) {
			System.out.println("\tGrade = A");
		}else if (average >=70) {
			System.out.println("\tGrade = B");
		}else if(average >=50) {
			System.out.println("\tGrade = C");	
		}else{
			System.out.println("\tGrade = F");		
		}
		System.out.println("\n");
		System.out.println("\tEnd of the Program ");
		

	}
}