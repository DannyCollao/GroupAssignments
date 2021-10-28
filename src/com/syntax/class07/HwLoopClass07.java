package com.syntax.class07;

public class HwLoopClass07 {

	public static void main(String[] args) {

		int c = 20;
		
		while (c <= 100) {
			System.out.println(c + " ");
			c += 2;
		}
		System.out.println("End of code");

		int a = 20;

		while (a <= 100) {
			
			if (a % 2 == 0) {
				System.out.println(a + " ");
			
				a++;
			}
		}
			
		System.out.println("----------End of code---------");
	}

}
