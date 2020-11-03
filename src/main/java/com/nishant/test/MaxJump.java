package com.nishant.test;

public class MaxJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums = {2, 1, 0, 1};
canJump(nums);
	}

	public static boolean  canJump(int[] nums) {
	    int maximumReach = 0;

	    for(int i = 0; i < nums.length; i++) {

	        // Return false if you jump more. 
	        if(i > maximumReach) { return false; }

	        // Logic is we need to keep checking every index the 
	        // farthest we can travel
	        // Update the maxReach accordingly.
	        maximumReach = Math.max(i + nums[i], maximumReach);
	    }

	    return true;
	}
	
}
