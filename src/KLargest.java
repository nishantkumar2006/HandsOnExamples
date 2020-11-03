package com.nishant.test;

import java.util.Arrays;
import java.util.Collections;

public class KLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Integer arr[] = new Integer[] { 1, 23, 12, 9, 
                 30, 2, 50 }; 
int k = 3; 
//kLargest(arr, k); 


 
    int num = 0; 
    /* First case */
    // The increment operator happens after the value is pushed onto the stack and assigned 
    num = num++; 
    // Prints initial value 
    System.out.println(num); 
    /* Second case */
    // Increment occurs first, and then it is pushed to the stack and assigned to num 
    num = ++num; 
    System.out.println(num); 


	}

	private static void kLargest(Integer[] arr, int k) {
		// TODO Auto-generated method stub
		
		//Arrays.sort(arr,Collections.reverseOrder());
		Arrays.sort(arr);
		
		
		for(int i=arr.length-1; i >k;i--){
			
			System.out.println(arr[i]);
		}
		
	}

}
