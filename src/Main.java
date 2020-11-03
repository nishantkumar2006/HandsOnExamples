package com.nishant.test;

import java.util.*;
public class Main {
 public static void main(String[] args) {
  String str1 = "GeeksforGeeks";
  
  firstUnique(str1);
  System.out.println("The given string is: " + str1);
  for (int i = 0; i < str1.length(); i++) {
   boolean unique = true;
   for (int j = 0; j < str1.length(); j++) {
    if (i != j && str1.charAt(i) == str1.charAt(j)) {
     unique = false;
     break;
    }
   }
   if (unique) {
    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
    break;
   }
  }
 }
 
 
 
 public static void firstUnique (String s) {
	 
	 HashMap<Character, Integer> hm = new LinkedHashMap<>();
	 
	 
	 for(int i=0; i<s.length(); i++) {
		 Integer counter = hm.get(s.charAt(i));
		 
		 if(counter != null) {
			 
			 counter = counter + 1;
			 hm.put(s.charAt(i), counter);
			 
		 }else {
			 
			 hm.put(s.charAt(i), 1);
		 }
		 
	 }
	 
	 hm.forEach((x,y) -> {
		 
		 System.out.println("key:"+x +"value"+y);
	 });
	 
	 for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
		 
		 if(entry.getValue() ==1) {
			 
			 System.out.println("unique value is::"+entry.getKey());
			 break;
		 }
		 
	 }
	 
 }
 

 
 
}
