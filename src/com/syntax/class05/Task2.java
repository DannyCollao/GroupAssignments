package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter a number of day");
		
		int day=in.nextInt();
		
		if( day == 1 ||day == 2 ||day == 3 || day == 4 || day == 5){
			System.out.println("It's a weekday");
		}else if( day == 6 || day == 7) {
			System.out.println("It's a weekend");
		}else {
			System.out.println("invalid day");
		}
	}

}
