package com.as.cs.excercises;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[][] a = new int[4][5];
		
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				System.out.print("Enter a number");
				a[i][j] = sc.nextInt();
			}
		}
sc.close();
	}

}

