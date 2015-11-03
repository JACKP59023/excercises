package com.as.cs.excercises;

import java.util.Scanner;

public class StudentsGrade {

	public static void main(String[] args) {
	
		float quiz;
		float midTerm;
		float finalScores;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("what was your quiz score");
		quiz=sc.nextFloat();
		
		System.out.println("what was your mid-term score");
		midTerm=sc.nextFloat();
		
		System.out.println("what is your final score");
		finalScores=sc.nextFloat();
		
		
		float adverage = (quiz + midTerm + finalScores) / 3;
		
		if (adverage >=90) 
				System.out.println("You got an A");
		else if(adverage >=70 and <90)
			System.out.println("You got a B");
		
		

	}

}
