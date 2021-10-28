package com.syntax.class06;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
	
		/*
		 * Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter country for the language");
		String country = input.next();
		String language = null;

		

		switch (country.toLowerCase()) {

		case "united states":
			language = "English";
			break;
		case "china":
			language = "chinese";
			break;
		case "peru":
			language = "Spanish";
			break;
		case "mexico":
			language = "Spanish";
			break;
		case "italy":
			language = "Italian";
			break;
		default:
			language = "Unknown";
		}

		if (!language.equals("Unknown")) {
			System.out.println("If your country is " + country + (" your language is ") + language);

		}else {
			System.out.println("Please try another country");
		}
	}

}
