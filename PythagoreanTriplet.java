package com.nishant.test;

import java.util.Arrays;

public class PythagoreanTriplet {

	// Driver code 
	  public static void main(String[] args) 
	  { 
	    int arr[] = { 3, 1, 4, 6, 5,7,8,9,2,12,13 }; 
	    
	    //1,9,16,25,36
	    //b      c, a
	    
	    int arr_size = arr.length; 
	    findTriplet(arr, arr_size);
	  } 
	
	static boolean findTriplet(int[] arr, int arr_size) {
		
		for(int i =0; i < arr_size; i++) {
			arr[i] = arr[i] * arr[i];
			
		}
		
		Arrays.sort(arr);
		int counter = 0;
		for(int i= arr_size-1; i >=2; i--) {
			
			int b = 0;
			int c = i-1;
			
			
			
			while(b < c) {
				
				
				
				if(arr[b] + arr[c] ==arr[i]) {
					
					System.out.println("Num1:"+Math.sqrt(arr[b]) +"Num2:"+ Math.sqrt(arr[c]) +"Num3:"+ Math.sqrt(arr[i]));
					
					b++;
					c--;
				}
				
				if(arr[b] + arr[c] < arr[i]) {
					b++;
				}else {
					c--;
					
				}
			}
			counter++;
			
			
		}
		
		System.out.println("counter:"+counter);
		
		
		return false;
	}

}
