package com.syntax.class05;

import java.util.Scanner;

public class HwAssigment1 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month define the season.
		 * Example: if user is born in June, July or August → season =“Summer”.
		 * At the end of the program we should see output as “You were born is season ______“.
		 * */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the month you were born in");
		
		String answer = input.next();

		
		if(answer.equalsIgnoreCase("June") || answer.equalsIgnoreCase("July") || answer.equalsIgnoreCase("August")){
			System.out.println("You were born in season Summer");
		}else if(answer.equalsIgnoreCase("September") ||answer.equalsIgnoreCase("October") ||answer.equalsIgnoreCase("November")){
			System.out.println("You were born in season Fall");
		}else if(answer.equalsIgnoreCase("December") ||answer.equalsIgnoreCase("January") ||answer.equalsIgnoreCase("February")){
			System.out.println("You were born in season Winter");
		}else if(answer.equalsIgnoreCase("March") ||answer.equalsIgnoreCase("April") ||answer.equalsIgnoreCase("May")){
			System.out.println("You were born in season Spring");
		}else {
			System.out.println("Invalid entry");
		}
		
		
	}

}
