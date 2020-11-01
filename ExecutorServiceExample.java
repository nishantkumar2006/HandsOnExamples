package com.nishant.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	
	public static void main(String[] args) {
		
		ExecutorService exServ = Executors.newFixedThreadPool(10);
		
		exServ.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Asynchronous task");
				
			}
		});
		exServ.shutdown();
	}
	
	

}
