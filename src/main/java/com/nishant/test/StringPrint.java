package com.nishant.test;

import java.util.ArrayList;
import java.util.List;

public class StringPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringtoPrint= "Nishant";
		//System.out.println(stringtoPrint.split(""));
		
		
		List<String> cars = new ArrayList<String>();
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.remove(0);
	    cars.add(0, "Lamb");
	    cars.add(2, "Rover");
	    cars.add(3, "Jag");
	    
		/*
		 * System.out.println(); for(String s : cars) { System.out.println("s for:"+s);
		 * 
		 * }
		 */
	    
	    
for(int i =0; i<cars.size() ; i++ ) {
			
			//System.out.println("car for index:"+i+ "car::"+cars.get(i));

	}
		
		
		
		String[] arr = {"N","i","s","h","a"};
		
		
		
		/*
		 * for(String s : arr) { System.out.println("s for:"+s);
		 * 
		 * }
		 */
		
for(int i =0; i<arr.length ; i++ ) {
			
			//System.out.println("s for:"+arr[i]);

	}
		
		
		
		StringPrint sp = new StringPrint();
		sp.printStringChar(stringtoPrint);
		
	}
	
	public char printStringChar(String stringtoPrint) {
		
		//String string= null;
		char [] charArr = stringtoPrint.toCharArray();
		
		for(int i =charArr.length-1; i>=0 ; i-- ) {
			
			System.out.println(charArr[i]);

	}
		return 0;	
		
		
	}
		
		
		
	}
	

