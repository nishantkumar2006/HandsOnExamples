package com.nishant.test;

public class MergeTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode  l1 = new ListNode(1);
	//	l1.val=1;
		
		
	
		ListNode  l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		//ListNode  l1.val = 1;
		//ListNode l2 = [1,3,4] ;
		
		printNodeData(l2);
				
				//mergeTwoLists(l1, l2);
	}
	
	static void printNodeData(ListNode l1) {
		
		while(l1 !=null) {
		System.out.println(l1.val + " ");
		//l1.
		
		l1 = l1.next;
		}
		//return l1;
		
		
	}
	
public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	
	if(l1==null) {
		return l2;
	}
	
	if(l2==null) {
		return l1;
	}
	
	if(l1.val < l2.val) {
		l1.next= mergeTwoLists(l1, l2);
		return l1;
		
	}else {
		
		l2.next = mergeTwoLists(l1, l2.next);
        return l2;
	}   
    }

}



 //* Definition for singly-linked list.
   
