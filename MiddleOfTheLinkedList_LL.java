package dsa60Days;

public class MiddleOfTheLinkedList_LL {
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
	
	    public ListNode middleNode(ListNode head) {
	        ListNode temp = head;
	        int count = 0;
	        int mid = 0;
	        while(temp!=null){
	            temp = temp.next;
	            count++;

	        }
	            mid = (count)/2 +1;
	     // Location where the node lies. It's not the index. 

	        temp = head;
	        while(temp!=null){  // 1. Temp starts from first element. 
	                            // 2. I calculate the mid and elminate the element from start to upto mid nodes.
	                            // 3.  When the node becomes 0- from there i start to collect the element and return it.
	            mid = mid-1;
	            if(mid == 0){
	                break;
	            }
	            temp = temp.next;  
	        }
	        return temp; 
	    }
	}



// Tortise and Hares method: 

/*
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  
    }
}  */
