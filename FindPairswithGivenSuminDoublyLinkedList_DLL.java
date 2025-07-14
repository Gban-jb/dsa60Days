package dsa60Days;

public class FindPairswithGivenSuminDoublyLinkedList_DLL {

	/*
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode prev;
	    
	    ListNode(int val) {
	        this.val = val;
	        this.next = null;
	        this.prev = null;
	    }
	}
	*/

	class Solution {
	    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
	        ListNode temp1 = head;
	        List<List<Integer>> list = new ArrayList<>();

	        while(temp1!=null){
	            ListNode temp2 = temp1.next;
	            while(temp2!=null && temp1.val + temp2.val <= target){
	                if(temp1.val + temp2.val == target){
	                    list.add(Arrays.asList(temp1.val, temp2.val));
	                }
	                temp2 = temp2.next;
	            }
	            temp1 = temp1.next;
	        }
	        return list;
	    }
	}
}
