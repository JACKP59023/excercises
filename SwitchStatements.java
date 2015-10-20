package com.as.cs.excercises;

public class SwitchStatements {

	public static void main(String[] args) {
		
		char grade = 'C';
		
		switch(grade)
		{
		case 'A':
			System.out.println("excellent!");
			break;
		case'B':
		case'C':
		    System.out.println("well done");
            break;
		case'D':
		    System.out.println("you passed");
            break;
		case'E':
			System.out.println("better luck next time");
			break;
		case'F':
			System.out.println("better try again");
			break;
		default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your grade is " + grade);

	}

}
