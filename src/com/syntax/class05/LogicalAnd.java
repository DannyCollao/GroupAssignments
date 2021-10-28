package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

		public static void main(String[] args) {
			
			boolean understandJava=true;
			boolean enjoyJava=true;
			
			if(understandJava && enjoyJava) {
				System.out.println("That is awesome");
			}else {
				System.out.println("You probably need to study more");	
			}
			
			/*
			 * ask user to enter number
			 * based on the entered number we will define if # is small, med, lg
			 * 
			 * if number is between 1 and 10 -->small
			 * if number is between 11 and 100 -->medium
			 * if number is between 101 and 1000 -->large
			 * if number is between 1001 -->xlarge
			 */
			
			Scanner in=new Scanner(System.in);
			System.out.println("Please enter any number");
			
			int num=in.nextInt();
			
			if (num>=1 && num<=10) {
				System.out.println(num+" is small " );
			
			}else if(num>=11 && num<=100) {
				System.out.println(num+" is medium ");
			
			}else if(num>=101 && num<=1000) {
				System.out.println(num+" is large ");
			
			}else {
				System.out.println(num+" is xlarge ");
			}	
			
		}
}
