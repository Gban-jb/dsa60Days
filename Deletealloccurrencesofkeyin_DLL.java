package dsa60Days;

public class Deletealloccurrencesofkeyin_DLL {

	/*Definition of doubly linked list:
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode prev;

	    ListNode() {
	        val = 0;
	        next = null;
	        prev = null;
	    }

	    ListNode(int data1) {
	        val = data1;
	        next = null;
	        prev = null;
	    }

	    ListNode(int data1, ListNode next1, ListNode prev1) {
	        val = data1;
	        next = next1;
	        prev = prev1;
	    }
	}
	 */

	class Solution {
	    public ListNode deleteAllOccurrences(ListNode head, int target) {
	        ListNode temp = head;

	        while (temp != null) {
	            if (temp.val == target) {
	                // Case 1: If the node to delete is the head
	                if (temp == head) {
	                    head = temp.next;
	                    if (head != null) {
	                        head.prev = null;
	                    }
	                    temp = head;
	                } 
	                // Case 2: Any other node (middle or tail)
	                else {
	                    ListNode prev = temp.prev;
	                    ListNode next = temp.next;

	                    prev.next = next;
	                    if (next != null) {
	                        next.prev = prev;
	                    }
	                    temp = next;
	                }
	            } else {
	                temp = temp.next;
	            }
	        }

	        return head;
	    }
	}



}
