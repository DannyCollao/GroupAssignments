package com.syntax.class07;

public class ClassAssignment1 {

	public static void main(String[] args) {
		/*
		 * print number from 30 to 70 using do while loop
		 * print odd numbers from 99 to 1 using do while
		 * 
		 */

		int a=1;
		
		while(a>=30) {
			System.out.println(a+" ");
			a++;
		}
		
		System.out.println("END OF CODE");
		
		int b=1;
		
		do {
			System.out.println("Hello");
			b++;
			
		}while(b<=90);
	}
?????????????????????????????????????????????????????????????
}
int i = 2;
while (i <= 10) {
	System.out.println(i + " ");
	i = i + 2;
}
System.out.println("End of code");

//System.out.println("I am outside of the while loop ");

//System.out.println(i);

//System.out.println("_________ANOTHER WAY__________");

int a = 1;

while (a <= 10) {
if (a % 2 == 0) {
	System.out.print(a + " ");
}
a++;
}
System.out.println("End of code");