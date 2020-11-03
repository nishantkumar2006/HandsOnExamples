package com.nishant.test;

import java.util.HashMap;

public class FractionToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String result = 	fractionToDecimal(-10, 3);
System.out.println(result);
	}
	
	public static String fractionToDecimal(int numerator, int denominator) {
		if (numerator == 0)
			return "0";
		if (denominator == 0)
			return "can't divide by 0";
	 
		String result = "";
	 
		// is result is negative
		if ((numerator < 0) ^ (denominator < 0)) {
			result += "-";
		}
	 
		// convert int to long
		long num = numerator, den = denominator;
		num = Math.abs(num);
		den = Math.abs(den);
		
		System.out.println(num);
		
		System.out.println(den);
		System.out.println("bef result::"+result);
		// quotient 
		long res = num / den;
		result += String.valueOf(res);
	 
		System.out.println(result);
		// if remainder is 0, return result
		long remainder = (num % den) * 10;
		if (remainder == 0)
			return result;
	 
		// right-hand side of decimal point
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		result += ".";
		while (remainder != 0) {
			// if digits repeat
			if (map.containsKey(remainder)) {
				int beg = map.get(remainder); 
				String part1 = result.substring(0, beg);
				String part2 = result.substring(beg, result.length());
				result = part1 + "(" + part2 + ")";
				return result;
			}
	 
			// continue
			map.put(remainder, result.length());
			res = remainder / den;
			result += String.valueOf(res);
			remainder = (remainder % den) * 10;
		}
	 
		return result;
	}

}
