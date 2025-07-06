package dsa60Days;

public class oddEvenLL {
	
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
	    public ListNode oddEvenList(ListNode head) {
	        
	        
	        /* if (head == null || head.next == null) return head;
	        ArrayList<Integer> oddArray = new ArrayList<>();
	        ArrayList<Integer> evenArray = new ArrayList<>();
	        ListNode current = head;
	        int index = 1;
	        while(current!=null){
	            if (index % 2 == 1){
	           oddArray.add(current.val);  // ListNode and arrayList : odd.val gives only integer
	        }
	        else{
	            evenArray.add(current.val);
	        }
	        current = current.next;
	        index++;
	        }
	        oddArray.addAll(evenArray);
	        return arrayLinkedList(oddArray);  
	    }

	    // Convert arrayList into LinkedList

	    public ListNode arrayLinkedList(ArrayList<Integer> array){
	        ListNode newHead= new ListNode(array.get(0));         // create the node not just the int value.
	        ListNode newTemp = newHead;
	        for(int i = 1; i < array.size(); i++){
	            newTemp.next = new ListNode(array.get(i));
	            newTemp = newTemp.next;
	        }
	        return newHead;

	        */


	        //Starting here: 

	        //Edge case: Boundary check: 

	if (head == null || head.next == null) return head;
	        // 1,2,3,4,5 : 1,3,5,2,4
	        ListNode odd = head;
	        ListNode even = head.next;
	        ListNode evenHead = even;


	        while(even != null && even.next != null){
	            odd.next = even.next;
	            odd = odd.next;

	            even.next = odd.next;
	            even = even.next;
	        }
	        odd.next = evenHead;

	        return head;
	    }
	}

}
