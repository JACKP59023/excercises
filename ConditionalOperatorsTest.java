package com.as.cs.excercises;

public class ConditionalOperatorsTest {

	public static void main(String[] args) {
		
		int numPets=5;
		String petStatus=(numPets < 4)?"Within Limit":"Exceeded Limit";
		
		System.out.println("The pet status is:"+ petStatus);
		

	}

}
