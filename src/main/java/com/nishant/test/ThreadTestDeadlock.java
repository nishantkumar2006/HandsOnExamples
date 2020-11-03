package com.nishant.test;

public class ThreadTestDeadlock {
	
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	
	private static class Thread1 extends Thread{
		
		@Override
		public void run() {
			
			synchronized(Lock1) {
				
				System.out.println();
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
}
