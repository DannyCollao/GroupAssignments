package com.syntax.reviewclass3;

import java.util.Scanner;

public class CommonIssues4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner=new Scanner(System.in);
		System.out.println("Please Enter a Number");		
		int number=scaner.nextInt();
		scaner.nextLine();
		System.out.println("Please Enter a Name");
		String name=scaner.nextLine();
		System.out.println("Please Enter a Number Again");
		int number2=scaner.nextInt();
		System.out.println(number);
		System.out.println(name);
		System.out.println(number2);
		
		
	}

}
