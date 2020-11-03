package com.nishant.dsalgo;

import java.util.ArrayDeque;
import java.util.Stack;

public class MatchingParanthesis {
	
	// Driver code 
    public static void main(String[] args) 
    { 
        String expr = "([{n}])"; 
        
 
        valid_parenthesis(expr);

    }
	
	public static boolean valid_parenthesis(String str) {
		char c=0;
		char top =0;
		ArrayDeque<Character> stack = new ArrayDeque<Character>();
		for(int i=0; i< str.length();i++ ) {
			c = str.charAt(i);
			if(c =='{' || c == '[' || c == '(') {
				stack.push(c);
				
			}else {
				if(stack.isEmpty()) {
					
					System.out.println("Empty stack");
					return false;
				}
				
				top = stack.peek();
				
				if((c =='}' && top == '{') || 
						(c ==']' && top == '[') || 
						(c ==')' && top == '(')) {
					
					stack.pop();
			}
		}
	}
		if(stack.isEmpty()) {
			System.out.println("Valid");
		return false;
		}else {
			
			System.out.println("Invalid.");
			return true;
		}

}
}
