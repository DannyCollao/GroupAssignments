package com.syntax.class05;

import java.util.Scanner;

public class LogicalOrDemo {

	public static void main(String[] args) {
		
		/*  ask user to enter today's date
		 *  if Monday or Friday-->no class
		 *  Tuesday or Wednesday-->manual class
		 *  Saturday or Sunday-->Java class
		 *  if Thursday--> Review
		 */
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter today's day");
		
		String day=scan.next();
		
		if(day.equals("Monday") ||day.equals("Friday")){
			System.out.println("No Class");
		}else if(day.equals("Tuesday") ||day.equals("Wednesday")){
			System.out.println("Manual Class");
		}else if(day.equals("Saturday") ||day.equals("Sunday")){
			System.out.println("Java Class");
		}else if(day.equals("Thursday")){
			System.out.println("Reviwew");
		}else {
			System.out.println("Wrong input");
		}
	}

}
