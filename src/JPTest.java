package com.nishant.test;

import java.util.ArrayList;
import java.util.List;
import java.math.*;

public class JPTest {

	//String binaryNmuber = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JPTest jp = new JPTest();
		System.out.println(jp.returnDecimal("101"));
		
		}

	
	
	public  int returnDecimal(String binary) {
		//List alist = new ArrayList<>();
		//binary = "10110110";
		binary = "1101";
		int number = 0;
		//int finalNumber= 0;
		
		System.out.println("Integer.parseInt::"+Integer.parseInt(binary,2 ));
		
		char [] iArray = binary.toCharArray();

		for(int i =0; i <iArray.length; i ++) {
System.out.println("iArray[i]::"+iArray[i]);
			
			int charToInt = Character.getNumericValue(iArray[i]);
			
			System.out.println(charToInt);
		//number += (int) (charToInt%10 * ( Math.pow(2, i)));
		
		number += (int) (charToInt * ( Math.pow(2, i)));
		
		
		//number += number;// + number;
		}
		return number;
	}

}
