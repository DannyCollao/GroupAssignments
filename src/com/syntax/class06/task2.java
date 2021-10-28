package com.syntax.class06;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your grade");
		String grade = input.next();
		String explanation= null;

		

		switch (grade) {

		case "A":
			explanation = "Excellent";
			break;
		case "B":
			explanation = "Good";
			break;
		case "C":
			explanation = "Average";
			break;
		case "D":
			explanation = "Bad";
			break;
		default:
			explanation = "Not Acceptable";
		}

		if (!explanation.equals("Not Acceptable")) {
			System.out.println("If your grade is " + grade + (" that means ") + explanation);

		}else {
			System.out.println("Please try another grade");
		}
	}

}

