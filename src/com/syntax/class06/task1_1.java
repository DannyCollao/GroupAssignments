package com.syntax.class06;

import java.util.Scanner;

public class task1_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter country for the language");
		String country = input.next();
		String language = null;

		

		switch (country.toUpperCase()) {

		case "USA":
		case "ENGLAND":
		case "AUSTRALIA":
			language = "English";
			break;
		case "china":
			language = "chinese";
			break;
		case "Bolivia":
		case "Peru":
		case "Mexico":
			language = "Spanish";
			break;
		case "italy":
			language = "Italian";
			break;
		default:
			language = "Please enter another country";
		}

			System.out.println("In " + country + (" people speak in: ") + language);
			
		}
	}

