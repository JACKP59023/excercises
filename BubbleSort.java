package com.as.cs.excercises;
import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		int[] list ={42,35,8,9,10,2,67,88,64,95,69,45,26};
		int temp = 0;
		
		for(int i=0;i<list.length-1;i++){
			
			for(int j=0;j<list.length-1;++j){
				if(list[j]>list[j+1]){
				temp = list[j];
				list[j] = list[j+1];
				list[j+1] = temp;
				
			}
			}
		}
			System.out.println(Arrays.toString(list));
		
		

	}
	}

