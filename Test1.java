package com.nishant.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s ="1";
Integer i =1;

System.out.println(s.equals(i));

//System.out.println(s==i);

List<String> a = new ArrayList<>();
a.add(0, "5");
a.add(1, "10");	
a.add(2, "5");
a.add(1, "7");
a.add(3, "9");

/*
 * for (int in=0; in< a.size();in++) { System.out.println("aval="+a.get(in) +
 * "--index="+in);
 * 
 * }
 */

a.forEach(alis -> System.out.println(alis));

//Stream and filter
//Output : B
a.stream()
	.filter(ali->ali.contains("10"))
	.forEach(System.out::println);

/*
 * for (String str : a){
 * 
 * 
 * System.out.println(str);
 * 
 * }
 */
		
	}

}
