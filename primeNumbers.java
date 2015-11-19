package com.as.cs.excercises;
import java.util.*;
public class primeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your number?");
		int number = sc.nextInt();
		int counter = 0;
		
		for(int i=1;i>number;i++){
			int remainder = number%i;
			
			if(remainder==0){
				counter++;}
			
			}
		if (counter == 2){
		System.out.println("Your number is prime");
		}
		else{ 
			System.out.println("Your number is not prime");
		}
			
			
			
			
			
		
		

	}
	}

