package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * prompt the user to enter person height in inches
		 * person should be classified as one of the following
		 * short(under 60 inches
		 * medium(between 60-72 inches
		 * tall(over 72 inches
		 */
	
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter height in inches");
		
		int height=in.nextInt();
		
		if (height>=1 && height<=60) {
			System.out.println(height+" is short");
		
		}else if(height>=61 && height<=72) {
			System.out.println(height+"is medium");
		
		}else {
			System.out.println(height+" is tall");
		}	
	}

}
