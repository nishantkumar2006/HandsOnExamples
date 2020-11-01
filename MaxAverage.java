package com.nishant.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MaxAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] array = {{"Bob","87"}, {"Mike", "35"},{"Bob", "52"}, {"Jason","35"}, {"Mike", "55"}, {"Jessica", "99"}};
		
		bestAvg(array);
	}
	
	public static int bestAvg(String[][] array) {
		
HashMap<String, List<String>> hm = new HashMap<>();

//System.out.println(array.length);

for(String [] s : array) {
	//for(int i =0; i<array.length ; i++) {
	
	//System.out.println("s.length::"+s.length);
	//System.out.println(s[0]);
	
	//System.out.println(s[1]);
	
	if(hm.containsKey(s[0])) {
		
		hm.get(s[0]).add(s[1]);
	
	//if(hm.get(s[0].g)) {
		
		
	}else {
		
		List<String> ls = new ArrayList<>();
		ls.add(s[1]);
		hm.put(s[0], ls);
		 
	}
	
}


int max =0;
String name = null;

//Map<Integer, String> treeMap = new TreeMap<>();


for(Map.Entry<String, List<String>> map : hm.entrySet()){
	
	
	System.out.println("getKey::"+map.getKey());
	
	//int l = map.getValue().size();
	//System.out.println(l);
	int avg = 0;
	avg = getSum(map.getValue())/map.getValue().size();
	
	if(avg >max) {
		//treeMap.put(max, map.getKey());
		name = map.getKey();
		max= avg;
	}
	
}
System.out.println("name::"+name);
System.out.println("max::"+max);
return max;

	}
public static int getSum (List<String> list) {
	 int sum = 0;
	
	for(String s : list) {
		
		sum +=Integer.parseInt(s);
	}
	
	System.out.println(sum);
	return sum;
	
	
}


		
	
		
		
		
		
		
		
	

}
