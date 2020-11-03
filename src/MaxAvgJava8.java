package com.nishant.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MaxAvgJava8 {


	public static void main(String[] args) {
		int max= 0;
		String[][] arr= {{"Janya", "99"},{"Pooja","88"},{"Nishant", "55"},{"Janya","65"},{"Janya","87"},{"Pooja","65"}};
		 max= getMax(arr);
	}
	

	private static int getMax(String[][] arr2) {
		// TODO Auto-generated method stub
		HashMap<String, List<String>> hm = new HashMap<>();
		
		int max=0;
		int sum=0;
		int avg =0;
		String name = null;
		
		for(String [] s: arr2) {
			
			if(hm.containsKey(s[0])) {
				hm.get(s[0]).add(s[1]);	
				
			}else {
				List l = new ArrayList<>();
				l.add(s[1]);
				hm.put(s[0], l);
				
			}
		}
		
		for(Map.Entry<String, List<String>> me : hm.entrySet()) {
			
			sum = getSum(me.getValue());
			
			avg = sum/me.getValue().size();
			
			if(avg > max) {
				name = me.getKey();
				max = avg;
			}
			
			
		}
		
		System.out.println(max);
		System.out.println(name);
		return 0;
	}


	private static int getSum(List<String> list) {
		
		int add = 0;
		
		for(String s : list) {
			
			add += Integer.parseInt(s);
			
		}
		// TODO Auto-generated method stub
		return add;
	}
	

}
