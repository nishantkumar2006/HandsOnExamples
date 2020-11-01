package com.nishant.test;

public class ExamRootMain {
	
    public static void main(String[] args) {
		
    	//["ExamRoom","seat","seat","seat","seat","leave","seat"], [[10],[],[],[],[],[4],[]]
    	
    	ExamRoom obj = new ExamRoom(10);
    	 int param_1 = obj.seat();
    	 obj.leave(4);
	}

}
