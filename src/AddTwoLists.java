package com.nishant.dsalgo;

public class AddTwoLists {

	
	public static void main(String[] args) {
		
	}
	
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode emptyNode = new ListNode(0);
        ListNode currentNode = new ListNode(0);
        ListNode result = currentNode;
        while (emptyNode != l1 || emptyNode != l2) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            currentNode = (currentNode.next = new ListNode(sum %= 10));
            l1 = null != l1.next ? l1.next : emptyNode;
            l2 = null != l2.next ? l2.next : emptyNode;
        }
        if (carry == 1)
            currentNode.next = new ListNode(carry);
        return result.next;
    }
	
	
	/*
	 * public ListNode addTwoNumbers(ListNode l1, ListNode l2) { ListNode dummyHead
	 * = new ListNode(0); ListNode p = l1, q = l2, curr = dummyHead; int carry = 0;
	 * while (p != null || q != null) { int x = (p != null) ? p.val : 0; int y = (q
	 * != null) ? q.val : 0; int sum = carry + x + y; carry = sum / 10; curr.next =
	 * new ListNode(sum % 10); curr = curr.next; if (p != null) p = p.next; if (q !=
	 * null) q = q.next; } if (carry > 0) { curr.next = new ListNode(carry); }
	 * return dummyHead.next; }
	 */
}
