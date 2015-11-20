package com.as.cs.excercises;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = {22,5,56,49,2};
		int tempVal = 0;
		int currentPos = 1;
		for (currentPos=1;currentPos<a.length;++currentPos){
			while(currentPos> 0 && a[currentPos]<a[currentPos-1]){
				tempVal=a[currentPos];
				a[currentPos]=a[currentPos-1];
				a[currentPos-1]=tempVal;
				--currentPos;
		}
}
		System.out.print(Arrays.toString(a));
}
}