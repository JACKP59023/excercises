package com.as.cs.excercises;

import java.util.*;

public class IsTheNumberEvenOrOdd {
	

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		int InputNumber;
		int Remainder;
		InputNumber = sc.nextInt();
		Remainder = InputNumber%2;
		
		if (Remainder==0){
		System.out.println("Even");
	    }
		else{
			System.out.println("Odd");
		
		}

	}

}
