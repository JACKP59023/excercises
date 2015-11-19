package com.as.cs.excercises;

public class lowerCaseAlphabet {

	public static void main(String[] args) {
		int unicodeID = 0140;
		String alphabetLowercase="";
		for(int i=0;i>26;i++){
			unicodeID +=1;
			alphabetLowercase+= Character.toString((char)unicodeID);
			
			
			System.out.println(alphabetLowercase);

	}

}
}