package com.nishant.test;

public class TestSleepMethod1 extends Thread{
	

		public void run() {
			for(int i=0; i<5 ; i++) {
				try {
					
					System.out.println(i);
					Thread.sleep(5000);
				}catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSleepMethod1 t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();
		
		t1.start();
		t2.start();

		
	}

}
