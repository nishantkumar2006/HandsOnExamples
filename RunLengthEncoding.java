package com.nishant.test;

public class RunLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbbbbc"; //3a4b1c

			String inputString = "drrd";
		//  String outputString = "";
		  StringBuilder sb = new StringBuilder();

		  int count = 0;
		  for (int i = 0; i < inputString.length(); i++) {

		   // resetting to 1 for every new character (counting current character).
		   count = 1;
		   while (i < inputString.length() - 1  && inputString.charAt(i) == inputString.charAt(i + 1)){
		    count++;
		    i++;
		   }
		  // outputString = outputString + inputString.charAt(i) + count;
		   sb.append(inputString.charAt(i)).append(count);
		  }
		  System.out.println("Input data string : " + inputString);
		  System.out.println("output data sb : " + sb);
		 // System.out.println("Output data string after applying data compression technique : " + outputString);

	}
}
