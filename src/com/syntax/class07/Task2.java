package com.syntax.class07;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 100 in 1 line with space Print numbers from 100 to 1
		 * Print even numbers from 20 to 1 (2 ways) Print odd numbers between 20 and 50
		 * (2 ways)
		 * 
		 */

		System.out.println("---   print numbers from 1 to 100 in 1 line with space   ---");

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("---   print numbers from 100 to 1   ---");

		for (int i = 100; i >= 1; i--) {
			System.out.println(i + " ");
		}
		
		System.out.println("---   print even numbers from 20 to 1 (way 1)   ---");

		for (int i = 20; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println("---   print even numbers from 20 to 1 (way 2)   ---");

		for (int z = 20; z >= 2; z -= 2) {
			System.out.println(z + " ");
		}
		System.out.println("---   print even numbers between 20 and 50 (way 1)   ---");

		for (int i = 20; i <= 50; i += 2) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println("---   print even numbers between 20 and 50 (way 2)   ---");

		for (int z = 20; z <= 50; z += 2) {
			System.out.println(z + " ");
		}
	}
}
