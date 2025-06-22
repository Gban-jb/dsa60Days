package dsa60Days;

public class capacityToShipPackageWithinDDays_BS {
	class Solution {
	    public int shipWithinDays(int[] weights, int days) {
	        int left = Integer.MIN_VALUE;
	        int right = 0;
	        int result = -1;

	        for(int num: weights){
	            left = Math.max(left, num);
	            right += num;
	        }

	        while(left <= right){   // goes from maximum element to the total sum of the array.
	            int mid = left + (right-left)/2;

	            boolean reqDays = daysPossible(weights, mid, days);
	                if(reqDays){
	                    result = mid;
	                    right = mid-1;
	                }
	                else{
	                    left = mid+1;
	                }
	            }
	            return result;
	        }

	        public static boolean daysPossible(int [] weights, int capacity, int days){
	            int daysRequired = 1;
	            int load = 0;

	            for(int i=0; i < weights.length; i++){

	                if(weights[i] + load <= capacity){
	                    load += weights[i];
	                }
	                else{
	                    load = weights[i];
	                    daysRequired +=1;
	                }
	            }

	            if(daysRequired <= days) return true;
	            else return false;
	        }
	}

}
