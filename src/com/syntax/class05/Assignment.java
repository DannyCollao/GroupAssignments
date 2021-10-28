package com.syntax.class05;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		/*
		 * writer a program that will ask user to input the current time (use 24 hour format)
		 * Based on the given time define:
		 * if hour is between1-11-->morning
		 * if hour is between12-15-->Afternoon
		 * if hour is between16-20-->Evening
		 * if hour is between21-24-->Night
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter current time");
		
		int time=in.nextInt();
		
		if (time>=1 && time<=11) {
			System.out.println("Right now it's Morning");
		}else if(time>=12 && time<=15) {
			System.out.println("Right now it's Afternoon");
		}else if(time>=16 && time<=20) {
			System.out.println("Right now it's Evening");
		}else if(time>=21 && time<=24) {	
			System.out.println("Right now it's Night");
		}else {
			System.out.println("Not valid time entered");
		}
		System.out.println("****************************");
		
		String timeOfDay=null;
		
		if(time>=1 && time<=11) {
			timeOfDay="morning";
		}else if(time>=12 && time<=15) {
			timeOfDay="Afternoon";
		}else if(time>=16 && time<=20) {
			timeOfDay="Evening";
		}else if(time>=21 && time<=24) {
			timeOfDay="Night";
		}else {
			timeOfDay="invalid";
		}
		System.out.println("Right now it's "+timeOfDay);
		
		
	}
	}
