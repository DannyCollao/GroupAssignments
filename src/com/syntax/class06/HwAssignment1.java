package com.syntax.class06;

import java.util.Scanner;

public class HwAssignment1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number 1");
		int a = input.nextInt();
		
		System.out.println("Please enter number 2");		
		int b = input.nextInt();
		
		System.out.println("Please enter your operator");
		char op = input.next().charAt(0);
		
		int solve = 0;
				
		switch (op) {
		case '*':
			solve = a * b;
			break;
		case '/':
			solve = a / b;
			break;
		case '+':
			solve = a + b;
			break;
		case '-':
			solve = a - b;
			break;
		default:
			System.out.println("Entry is invalid");
		}
		
		System.out.println(solve);
		
	}

}
