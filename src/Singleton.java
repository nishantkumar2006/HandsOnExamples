package com.nishant.test;

public class Singleton {
	
	private static Singleton singInstance = null;
	
	private Singleton(){
		System.out.println("Singleton");
	}
	
	public static Singleton getInstance() {
		
		if(singInstance == null) {
			singInstance = new Singleton();
		}
		return singInstance;
		
		
	}

}
