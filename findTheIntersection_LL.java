package dsa60Days;

public class findTheIntersection_LL {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        //TC: O(n+m);
	        //SC: O(1);
	        
	        //Get two head
	        ListNode temp1 = headA;
	        ListNode temp2 = headB;

	        while(temp1!=temp2){
	            temp1 = temp1.next;
	            temp2 = temp2.next;

	            if(temp1==temp2) return temp1;

	            if(temp1== null){
	                temp1 = headB;}
	            else if(temp2 == null){
	                temp2 = headA;    }
	        }
	        return temp1;  
	    }
	}


	/*


	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 

	 // Next Method: 

	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

	        //1. Count n1, n2
	        //2. Find the colliosion point and return it.

	//Edge cases: 
	        if (headA == null || headB == null) return null;

	        ListNode temp1 = headA;
	        ListNode temp2 = headB;
	        int N1 = 0;
	        int N2 = 0;
	        while(temp1!=null){
	            N1++;
	            temp1=temp1.next;
	        }
	        while(temp2!=null){
	            N2++;
	            temp2=temp2.next;
	        }
	        if(N1 > N2){
	            return collisionPoint(headB, headA, N1-N2);
	        } 
	        else{
	            return collisionPoint(headA, headB, N2-N1);
	        }       
	    }

	    public static ListNode collisionPoint(ListNode temp1, ListNode temp2, int d){
	        while(d!=0){
	            temp2 = temp2.next;
	            d--;
	        }
	        while(temp1!=temp2){
	            temp1=temp1.next;
	            temp2=temp2.next;
	        }
	        return temp1;
	    }
	}

	*/










	/*  HashMap Method: 
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }

	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        HashMap<ListNode, Integer> map = new HashMap<>();
	        ListNode temp1 = headA;
	        while(temp1!=null){
	            map.put(temp1, temp1.val);
	            temp1 = temp1.next;
	        }

	        ListNode temp2 = headB;
	        while(temp2!=null){
	            if(map.containsKey(temp2)){
	                return temp2;
	            }
	            temp2 = temp2.next;
	        }
	        return null;   
	    }
	}
	*/

}
