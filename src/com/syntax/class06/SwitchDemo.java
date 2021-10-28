package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/*
		 * rules:
		 * 1. Values is case MUST be the same data type as a VARIABLE in switch
		 * 2. We can not have Duplicate Cases
		 */
		
		char gender='h';
		String description;
		
		switch(gender) {
		
		case 'm':
			description="Male";
			break;
		case 'M':
			description="Male";
			break;
		case 'f':
			description="Female";
			break;
		case 'F':
			description="Female";
			break;
		default:
			description="Unknown";
		}
		
		System.out.println(gender +" means "+description);
		/*
		 * limitationof operators
		 * 1. We can not use logical operators
		 * 2. We can not use relational operators
		 * 
		 * limitation of data types
		 * 1. Can not use boolean
		 * 2. Can not used with double/float
		 * 3. can not be used with long
		 * 
		 */
		
	}
}
