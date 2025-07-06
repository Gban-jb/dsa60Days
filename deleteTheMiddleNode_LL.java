package dsa60Days;

public class deleteTheMiddleNode_LL {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	class Solution {
	    public ListNode deleteMiddle(ListNode head) {
	        if(head == null || head.next == null) return null;

	        ListNode slow = head;
	        ListNode fast = head;
	        ListNode prev = null;
	        
	        while(fast!=null && fast.next!=null){
	            prev = slow;
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        prev.next = slow.next;
	        return head;   
	    }
	}



	/*  
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 
	 /*
	class Solution {
	    public ListNode deleteMiddle(ListNode head) {
	        int count = 0;
	        ListNode temp = head;
	        int mid = 0;

	        while(temp!=null){
	            count++;
	            temp = temp.next;
	        }
	        mid = count /2;
	        temp = head;

	        //Boundary Cases: 
	        if (count == 1) return null;
	        else if(count == 2){
	            temp.next = null;
	            return head;
	        }
	        else{
	        int index = 1;
	        while(temp!=null){
	            if(index == mid){  //Working on index here
	                temp.next = temp.next.next;
	                index++;
	        }
	        else{
	            temp = temp.next;
	            index++;
	        }
	        }
	        return head; }
	    }
	} 


	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 
	class Solution {
	    public ListNode deleteMiddle(ListNode head) {
	        // Edge case: only one node
	        if (head == null || head.next == null) return null;

	        ListNode slow = head;
	        ListNode fast = head;
	        int count = 0;

	        // Step 1: Find the middle index using slow/fast
	        while (fast != null && fast.next != null) {
	            count++;
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        // count now holds the middle index (0-based)
	        // Step 2: Traverse again to node before middle
	        ListNode temp = head;
	        int index = 1; // we want to stop at node before `count`, so start from 1

	        if (count == 0) {
	            // Two nodes only, delete the second (middle)
	            return head.next;
	        }

	        while (index < count) {
	            temp = temp.next;
	            index++;
	        }

	        // Delete the middle node
	        temp.next = temp.next.next;

	        return head;
	    }
	}

	 */
}
