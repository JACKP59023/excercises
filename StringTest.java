package com.as.cs.excercises;

public class StringTest {

	public static void main(String[] args) {
	
		String FirstName = "Jack";
		String LastName = "Pearce";
		String NewJack = "Jack";
		String NewName = new String("Jack");
		
		String FullName = FirstName + (" ") + LastName;
		
		System.out.println(FullName);
		System.out.println(FirstName.equals(LastName));
		System.out.println(FirstName.equals(NewJack));
		System.out.println(FirstName==NewName);
		
		
		if (FirstName.equals(NewName));
				System.out.println(FirstName);
		
		

	}

}
