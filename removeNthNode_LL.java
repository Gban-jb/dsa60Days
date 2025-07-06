package dsa60Days;

public class removeNthNode_LL {
	
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
	    public ListNode removeNthFromEnd(ListNode head, int n) {

	//  Boundary Check: 
	        if (head == null) return null;
	        ListNode reversedList = reverse(head);
	        int index = 1;
	        ListNode current = reversedList;  // 

	        // Step 2: 

	        if (n == 1) {
	            reversedList = reversedList.next; // remove the head - first element gone
	        } else {
	            for(int i = 1; i < n-1; i++){
	                current = current.next;
	            }
	            current.next = current.next.next;
	        }
	          
	        return reverse(reversedList);   // Step 3: return the orginal LL.       
	    }

	    public ListNode reverse(ListNode head){
	        ListNode temp = head;
	        ListNode prev = null;

	        while(temp!= null){
	            ListNode front = temp.next;
	            temp.next = prev;
	            prev = temp;
	            temp = front;
	        }
	        return prev;
	    }
	}

}
