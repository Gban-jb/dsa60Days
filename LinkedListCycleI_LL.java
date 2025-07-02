package dsa60Days;

public class LinkedListCycleI_LL {

	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	public class Solution {
	    public boolean hasCycle(ListNode head) {
	        // Using HashMap
	       /* HashMap <ListNode, Integer> map = new HashMap<>();
	        ListNode temp = head;
	        while(temp!=null){
	            if(map.containsKey(temp)){
	            return true;
	        }
	        else{
	            map.put((temp),1);
	        }
	        temp= temp.next;
	        }
	        return false; */

	        // Using Optimal way: Slow and Fast Node and known as Tortose and Hare Methods: 
	        ListNode slow = head;
	        ListNode fast = head;

	        while(fast!=null && fast.next!=null){
	            slow = slow.next;
	            fast = fast.next.next;
	            if(slow == fast){
	                return true;
	            }
	        }
	        return false;
	    }
	}
}
