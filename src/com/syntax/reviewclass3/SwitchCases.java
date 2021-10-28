package com.syntax.reviewclass3;

public class SwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month=5;
		
		//if is condition based (true or false)
		
		String monthName="Jan";
		if(month==1) {
			System.out.println("Jan");
		}else if(month==2) {
			System.out.println("Feb");
		}else if(month==3) {
			System.out.println("Mar");
		}else if(month==4) {
			System.out.println("Apr");
		}else if(month==5) {
			System.out.println("May");
		}else if(month==6) {
			System.out.println("Jun");
		}else if(month==7) {
			System.out.println("Jul");
		}else if(month==8) {
			System.out.println("Aug");
		}else if(month==9) {
			System.out.println("Sep");
		}else if(month==10) {
			System.out.println("Oct");
		}else if(month==11) {
			System.out.println("Nov");
		}else if(month==12) {
			System.out.println("Dec");
		    System.out.println(monthName);
	}
		//other way
		
		Switch (month) {
			
		Case 1:
			System.out.println("Jan");
		break;
		Case 2:
			System.out.println("Feb");
		break;
		Case 3:
			System.out.println("Mar");
		break;
		Case 4:
			System.out.println("Apr");
		break;
		Case 5:
			System.out.println("May");
		break;
		Case 6:
			System.out.println("Jun");
		break;
		Case 7:
			System.out.println("Jul");
		break;
		Case 8:
			System.out.println("Aug");
		break;
		Case 9:
			System.out.println("Sep");
		break;
		Case 10:
			System.out.println("Oct");
		break;
		Case 11:
			System.out.println("Nov");
		break;
		Case 12:
			System.out.println("Dec");
		
	}

}
