package dsa60Days;

public class DeleteNodeinaSingleLinkedList {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	    public void deleteNode(ListNode node) {
	        node.val = node.next.val;
	        node.next = node.next.next;
	    }
	}

