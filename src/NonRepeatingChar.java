package com.nishant.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "GeeksforGeeks";
		
		//getFirstUnique(str);
		
		HashMap<Character, Integer> hm = new LinkedHashMap<>();
		
		//List<String> al = new ArrayList<>();
		
		
		//char[] strArr = str.toCharArray();
	//	al = strArr.asLi
		
		for(int i=0; i<str.length();i++) {
			
			System.out.println("charAT::"+str.charAt(i));
			
			System.out.println("strArr[i]::"+str.charAt(i));
			
			Integer counter = hm.get(str.charAt(i));
		//	int counterValue = 0 ;
			
		//	if(hm.containsKey(strArr[i])) {
			
			if(null != counter ) {
				
				counter = counter +1;
				hm.put(str.charAt(i), counter);
//System.out.println(strArr[i]);
				//return;
			}else {
				
				hm.put(str.charAt(i), Integer.parseInt("1"));
			}
			
			
			//al.add(strArr[i].);
			
			//System.out.println("i::::"+i+"::::"+strArr[i]);
			
			
		}
		
		for(Entry<Character, Integer> m : hm.entrySet()) {
			
			if(m.getValue() == 1) {
				
				System.out.println("unique hai::"+m.getKey());
				break;
				
			}
			
			
		}
		
		//hm.forEach((x,y) -> {System.out.println("key::"+x + "value::"+y);});
		
		

	}
	
	
	public static void getFirstUnique(String s) {
		
		for(int i=0; i < s.length();i++){
			
		boolean flag = true;
		
		for(int j=0; j < s.length();j++){
			
			if(i != j && s.charAt(i) == s.charAt(j)) {
				
				flag = false;
				break;
			}
			
		}
			if(flag) {
				
				System.out.println("The first non repeated character in String is: " + s.charAt(i));
			    break;
			}
			
		}
		
		
	}

}
