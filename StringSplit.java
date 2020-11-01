package com.nishant.test;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String binaryNum = "10110110";
		
		String binaryNum = "101";
		
		StringSplit ss = new StringSplit();
		ss.binaryDecimal(binaryNum);
		
	}
	
	public int stringSplitter(String s) {
		
		
		
		return 0;
	}
	
	
public int binaryDecimal(String s) {
		
	int number = 0;
	int binaryNumber = 0;
		char[] stringCharArray = s.toCharArray();
		
		for(int i = 0; i <stringCharArray.length ; i++) {
			
			binaryNumber = Character.getNumericValue(stringCharArray[i]);
			
			System.out.println("binaryNumber ::"+binaryNumber);
			
			number += binaryNumber * (Math.pow(2, i));
			
			//number += (int) (charToInt * ( Math.pow(2, i)));
			
		}
		System.out.println(number);
		
		return number;
	}

}
