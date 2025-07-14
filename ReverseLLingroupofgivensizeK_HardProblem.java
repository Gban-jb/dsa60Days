package dsa60Days;

public class ReverseLLingroupofgivensizeK_HardProblem {
	
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
	    public ListNode reverseKGroup(ListNode head, int k) {
	        ListNode temp = head;
	        ListNode previousNode = null;
	        ListNode nextNode;

	        while(temp!=null){
	            ListNode kthNode = getKthNode(temp, k);
	            if (kthNode == null)
	                break;

	            nextNode = kthNode.next;
	            kthNode.next = null;
	           ListNode newHead =  reverseLinkedList(temp);

	            if(temp == head){
	                head = newHead;
	            }

	        else {
	             previousNode.next = newHead;
	            }
	            previousNode = temp;
	             temp = nextNode;
	            previousNode.next = temp;  // connect tail to next group (important!)
	        }
	return head;   
	    }

	    public static ListNode getKthNode(ListNode temp, int k){
	        while(temp!=null && k > 1){
	            temp = temp.next;
	            k--;
	        }
	        return temp;
	    }

	    public static ListNode reverseLinkedList(ListNode temp){
	        if (temp == null || temp.next == null) return temp;
	        ListNode curr = temp;
	        ListNode prev = null;

	        while(curr!=null){
	            ListNode nextNode = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = nextNode;
	        }
	        return prev;
	    }
	}

}
