package com.nishant.test;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "the sky is blue";
		
		String reverseString = null;
		
		reverseString = reverseWords(s);
		 System.out.println(reverseString);
		
		//reverseString(s);
		
	}

		public static String reverseWords(String s) {
			if (s == null || s.length() == 0) {
				return "";
			}
	 
			// split to words by space
			String[] arr = s.split(" ");
			StringBuilder sb = new StringBuilder();
			for (int i = arr.length - 1; i >= 0; i--) {
				if (!arr[i].equals("")) {
					sb.append(arr[i]).append(" ");
				}
			}
			
			return sb.toString();
			//return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
		}
		
		
		public static String reverseString(String s) {
			if (s == null || s.length() == 0) {
				return "";
			}
	 
			for(int i = s.length()-1; i >=0;--i ) {
				
				System.out.println(s.charAt(i));
			}
			
			
			// split to words by space
			String[] arr = s.split(" ");
			StringBuilder sb = new StringBuilder();
			for (int i = arr.length - 1; i >= 0; --i) {
				if (!arr[i].equals("")) {
					sb.append(arr[i]).append(" ");
				}
			}
			return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
		}
	
	
	
}
