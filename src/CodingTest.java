package com.nishant.test;

import java.util.ArrayList;
import java.util.List;

public class CodingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		returnFactor(12);

	}
	
	public static List<Integer> returnFactor(int number){
		
		//number 12 --> 1,2,3,4,6,12
		//1000 -> 1,1000, 2,500,4,250,   till 0nly 500
		List<Integer> factorList = new ArrayList<>();
		int factor = 0;
		
		if(number == 0) {
			return null;
		}
		
		
		for(int i = 1; i <=number/2; i ++) {
			
			if(number % i ==0) {
				factorList.add(i);
			}
		}
		System.out.println(factorList);
		return factorList;
		
		
	}

}
