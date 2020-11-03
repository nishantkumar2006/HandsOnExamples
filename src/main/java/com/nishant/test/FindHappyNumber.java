package com.nishant.test;

import java.util.HashSet;
import java.util.Set;

//https://demo.firepad.io/#blackbird
public class FindHappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isHappyNumber(19);
		
		//getNext(116);
	}
	
	static boolean isHappyNumber(int n) {
		

		while (n != 1) {
            n = getNext(n);
        }
        return n == 1;
		
	}

	private static int getNext(int number) {
		// TODO Auto-generated method stub
		int totalSum =0;
		while(number > 0){
			int d = number%10;
			
			number = number/10;
			 
			totalSum +=d *d;
			
		}
		return totalSum;
		
		
	}
	


}
