package com.syntax.class07;

import java.util.Scanner;

public class HwAssignment2 {

	public static void main(String[] args) {
		/*
		 * ask user to pay for an item continue asking to pay until user gets a right
		 * amount
		 * 
		 * if user gives extra money--->give change if user gives less money---> ask how
		 * much more you need
		 */

		double totalCost = 59.99;
		Scanner input = new Scanner(System.in);
		double received = 0;
		double cashBack = received - totalCost;

		System.out.println("Please, pay for your item!");

		do {
			System.out.println("your change is " + cashBack);
			received = input.nextDouble();

		} while (received != totalCost);

		System.out.println("Thank you!");

	}
}
