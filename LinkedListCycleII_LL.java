package dsa60Days;

public class LinkedListCycleII_LL {
	
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
	    public ListNode detectCycle(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;
	        while(fast != null && fast.next!= null){
	            slow = slow.next;
	            fast = fast.next.next; 
	            if(slow == fast){
	                slow = head;

	                while(slow != fast){
	                fast = fast.next;
	                slow = slow.next;
	                }
	                return slow;
	                }
	            }
	    return null;      
	        
	        //HashMap : Brutle Force way
	        /*
	        HashMap <ListNode, Integer> map = new HashMap<>();
	        ListNode temp = head;
	        while(temp != null){
	            if(map.containsKey(temp)){
	                return temp;
	            }
	            else{
	                map.put((temp), 1);
	            }
	            temp = temp.next;
	        }
	        return null;    */
	    }
	}

}
