package com.as.cs.excercises;
import java.util.*;
public class CheckEvenOdd {
	
	public static void main(String[] args){ 
		checkEligibility();
	}
		static void checkEligibility(){
		
    	int age;
    	
    	Scanner sc=new Scanner(System.in);  
    	System.out.print("What is your age?");
    	age=sc.nextInt();
    			if(age>=18)
    				System.out.println("lets get married.");
    			else
    				System.out.println("Hmmm, aren't you a bit too young?");
    }
}
    
