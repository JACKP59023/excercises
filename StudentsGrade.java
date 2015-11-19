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
		
		
		float average = (quiz + midTerm + finalScores) / 3;
		
		if (average >=90) 
				System.out.println("You got an A");
		else if(average >=70)
			System.out.println("You got a B");
		else if(average >=50)
			System.out.println("you got a c");
		
		

	}

}
