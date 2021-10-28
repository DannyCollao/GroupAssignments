package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {

		/*
		 * We need to capture a country from a user based on the country we have to
		 * define a favorite food
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter country for favorite food");
		String country = input.next();
		String favFood = null;

		

		switch (country.toLowerCase()) {

		case "united states":
			favFood = "Burger";
			break;
		case "bolivia":
			favFood = "Silpancho";
			break;
		case "peru":
			favFood = "Ceviche";
			break;
		case "mexico":
			favFood = "Tacos";
			break;
		case "italy":
			favFood = "Pasta";
			break;
		default:
			favFood = "Unknown";
		}

		if (!favFood.equals("Unknown")) {
			System.out.println("If your country is " + country + (" your favorite food is ") + favFood);

		}else {
			System.out.println("Please try another country");
		}
	}

}
