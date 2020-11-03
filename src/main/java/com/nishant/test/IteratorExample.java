package com.nishant.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al= new ArrayList<>();
		HashMap<String, String> hm = new LinkedHashMap<>();
		al.add("Violet");
		al.add("Indigo");
		al.add("Green");
		al.add("Blue");
		hm.put("Color1", "Violet");
		hm.put("Color3", "Green");
		hm.put("Color4", "Blue");
		hm.put("Color2", "Indigo");
	

		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		hm.forEach((key,value) -> System.out.println(key + "="+value));
		
		//Iterator ihm = hm.itera
		
		/*
		 * for(Map.Entry<String, String> set : hm.entrySet()) {
		 * System.out.println("Key:"+set.getKey() + "Value:"+ set.getValue()); }
		 */
		
		/*for(Entry<String, String> set : hm.entrySet()) {
			 System.out.println("Key:"+set.getKey() + "Value:"+ set.getValue()); 
		}*/
		
		hm.forEach((key,value) -> System.out.println(key + " = " + value));
	//}
		
	}

}
