package dsa60Days;

public class Rotate_List_LL {
	
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
	    public ListNode rotateRight(ListNode head, int k) {
	        // 1. Find the nth node : len-k that will be my tail and tail.next will be head
	        // 2. Find the nth node
	        //3. Make the nth node. next head and before that tail.
	        // 4. if it is the multiple of len then no need return head. 

	        if (head == null || head.next == null || k == 0) return head;


	        ListNode tail = head;
	        int length = 1;

	        while(tail.next != null){
	            length++;
	            tail = tail.next;
	            }
	        
	            if( k % length == 0) return head;
	            k = k % length;
	            ListNode nthNode = getNthNode(head, length-k);
	            tail.next = head;
	            
	            // Attach the tail to the null
	            ListNode newTail = nthNode;
	            ListNode newHead = newTail.next;
	            head =newHead;
	            nthNode.next = null; 
	            return head;
	    }

	    public static ListNode getNthNode(ListNode temp, int k){
	        while (temp!=null && k > 1){
	            temp = temp.next;
	            k--;
	        }
	        return temp;
	    }
	}
}
