package com.nishant.test;

public class Robot {

	
	public static void main(String[] args) 
    { 
        String move = "UDDLLRUUUDUURUDDUULLDRRRR"; 
        finalPosition(move); 
    }

	private static void finalPosition(String move) {
		// TODO Auto-generated method stub
		
		int length = move.length();
		int upcount= 0, downCount=0;
		int leftCount=0, rightCount=0;
		
		for(int i =0; i <length; i++) {
			
			
			
			if(move.charAt(i) =='U') {
				
				upcount++;
				
				
				
			}else if(move.charAt(i) =='D')  {
				
				downCount++;
			}else if(move.charAt(i) =='L') {
				
				leftCount++;
				
			}else if(move.charAt(i) =='R') {
				
				rightCount++;
				
			}
			
			
		}
		
		
		System.out.println("coordinates"+ (upcount-downCount)+","+(rightCount-leftCount));
		
	} 
	
	
}
