package com.syntax.class05;

import java.util.Scanner;

public class HwAssignment2 {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
		 * if the average score >=90 → grade=A
		 * if the average score >= 70 and <90 → grade=B
		 * if the average score>=50 and <70 → grade=C
		 * if the average score<50 → grade=F
		 */

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		
		
		double quiz=input.nextDouble();
		double midTerm=input.nextDouble();
		double finalScore=input.nextDouble();
		
		double a=quiz;
		double b=midTerm;
		double c=finalScore;
		double	sum = a+b+c;
		double	average= sum/3;
		
		
		if (average >= 90) {
			System.out.println("Grade=A");
		}else if (average >=70) {
			System.out.println("Grade=B");
		}else if(average >=50) {
			System.out.println("Grade=C");	
		}else{
			System.out.println("Grade=F");	
		
		}
	}

}
