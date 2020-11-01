package com.nishant.test;

import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getBrackets("({{[]})");

	}
	
 static void getBrackets(String bracks) {
	 
	 Stack stk = new Stack();
	 
	 for(int i =0; i <=bracks.length()-1;i++) {
		 char ch = bracks.charAt(i);
		 
		 if (ch == '{' || ch == '[' || ch == '(') {
			 
			 stk.push(ch);
		 }else if((ch == '}' || ch == ']' || ch == ')')){
			 stk.pop();
	 }
	 
	 
 }
	 if(stk.isEmpty()) {
		 
		 System.out.println("Equal bracks");
	 }
 }
}


