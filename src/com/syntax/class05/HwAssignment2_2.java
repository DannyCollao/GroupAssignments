package com.syntax.class05;

import java.util.Scanner;

public class HwAssignment2_2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);

		int a=0, b=0, c=0;
		int sum=0, average=0;
		
		System.out.println("Final Grade Average from Quizes, Mid Term, and Final");
		System.out.print("Enter Quiz grade : ");
		a = input.nextInt();
		System.out.print("Enter Mid Term grade : ");
		b = input.nextInt();
		System.out.print("Enter Final grade : ");
		c = input.nextInt();
		
		sum = (a+b+c);
		average = (sum/3);
		
		System.out.println("The Final Grade Average is " +average);
		
		if (average >= 90) {
			System.out.println("Grade = A");
		}else if (average >=70) {
			System.out.println("Grade = B");
		}else if(average >=50) {
			System.out.println("Grade = C");	
		}else{
			System.out.println("Grade = F");		
		}
	}
	}
	
