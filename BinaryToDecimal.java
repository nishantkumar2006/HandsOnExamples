package com.nishant.test;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryToDecimal btd = new BinaryToDecimal();
//	int result=	btd.binaryToDecimal("1011110110");
	
	
	double resultDouble=binaryToDecimalString("1011110110");
		System.out.println("resultDouble::"+resultDouble);
				

	}
	
	public int binaryToDecimal(String binary) {
		int decimalNum = 0;
		System.out.println("Integer.parseInt::"+Integer.parseInt(binary, 2));
		
		char [] charArr = binary.toCharArray();
		
		int counter = 0;
		
		//for(int i =0; i<charArr.length ; i++ ) {
		
		for(int i =charArr.length-1; i>=0 ; i-- ) {
			
			//System.out.println("I:::"+i);
			
			//int rem = charArr[i]%10;
			int charToInt = Character.getNumericValue(charArr[i]);
			
			//System.out.println("rem::"+rem);
			
			//System.out.println("counter::"+counter);
			
			//System.out.println("charToInt::"+charToInt);
			
			System.out.println("decimalNum::"+ (int) (charToInt * Math.pow(2, counter)));
			
			 decimalNum += (int) (charToInt * Math.pow(2, counter));
			 counter++;
			//System.out.println("decimalNum::"+decimalNum);
		}
		
		return decimalNum;
		
		
	}
	
	
	public static double binaryToDecimalString(String binary) {
		//int decimalNum = 0;
		System.out.println("Integer.parseInt::"+Integer.parseInt(binary, 2));
		
		//char [] charArr = binary.toCharArray();
		
		int counter = 0;
		char c =0;
		int decimalValue = 0;
		
		//for(int i =0; i<charArr.length ; i++ ) {
		
		//for(int i =charArr.length-1; i>=0 ; i-- ) {
		
		for(int i =binary.length()-1; i>=0;i--) {
			
			c = binary.charAt(i);
			
			int intValue = Character.getNumericValue(c);
			
			decimalValue += intValue * (Math.pow(2, counter));
			
			//decimalValue += decimalValue;
			counter++;
			//System.out.println("I:::"+i);
			
			//int rem = charArr[i]%10;
			//int charToInt = Character.getNumericValue(charArr[i]);
			
			//System.out.println("rem::"+rem);
			
			//System.out.println("counter::"+counter);
			
			//System.out.println("charToInt::"+charToInt);
			
			//System.out.println("decimalNum::"+ (int) (charToInt * Math.pow(2, counter)));
			
			// decimalNum += (int) (charToInt * Math.pow(2, counter));
			// counter++;
			//System.out.println("decimalNum::"+decimalNum);
		}
		
		System.out.println(decimalValue);
		
		return decimalValue;
		
		
	}

}
