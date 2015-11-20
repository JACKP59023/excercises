package com.as.cs.excercises;
import java.util.Arrays;
public class binarySearch {

public static void main(String[] args) {
		int[] array = {22,5,56,49,2};
		int tempVal = 0;
		int currentPos = 1;
		for (currentPos=1;currentPos<array.length;++currentPos){
			while(currentPos> 0 && array[currentPos]<array[currentPos-1]){
				tempVal=array[currentPos];
				array[currentPos]=array[currentPos-1];
				array[currentPos-1]=tempVal;
				--currentPos;
			}
			}	
		System.out.println(Arrays.toString(array));
		secondary(array);
	}
	
	public static void secondary(int[] array){
		int x = 56;
		String result = binarySearch(array,x)?"Value found" : "Not found";
System.out.println(result);
		
}
public static boolean binarySearch(int[] array, int searchValue){
	int start = 0;
	int end = array.length-1;

	for(int i=0;i<array.length;i++){
		int middle = (end+start)/2;
		if(array[middle]==searchValue){
			return true;
		}
		else if(array[middle]>searchValue){
			end=middle-1;
		}
		else{
			start=middle+1;
		}
	}
	return false;
}
}
