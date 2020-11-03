package com.nishant.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ProcessCharByChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcdaghj";
		processCharByChar(str);

	}
	
	static void processCharByChar(String str) {
		Set<Character> set = new LinkedHashSet<>();
		
		List<Character> list = new ArrayList<Character>(set);
		for(int i=0; i<=str.length()-1;i++) {
			
			char c = str.charAt(i);
			
			if(!set.contains(c)){
				System.out.println("C::"+c);
			set.add(c);
			}else {
				
				System.out.println("Already processed.");
			}
		}
		list = new ArrayList<Character>(set);
		System.out.println("list:"+list.get(0));
		System.out.println(set);
	}

}
