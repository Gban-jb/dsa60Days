package dsa60Days;

public class minimumNumberOfDaystoMakeMBouquests_BS {
	
	class Solution {
	    public int minDays(int[] bloomDay, int m, int k) {
	        int N = bloomDay.length;
	        if (m * k > N) return -1;
	        int left  = Integer.MAX_VALUE;
	        int right = Integer.MIN_VALUE;

	        for(int day: bloomDay){
	            left = Math.min(left, day);
	            right = Math.max(right, day);
	        }
	        int result = -1;
	        while(left <=right){
	            int mid = left + (right - left)/2;

	            if(canBloom(bloomDay, m,k,mid)){
	                result = mid;
	                right = mid-1;
	            }
	            else{
	                left = mid+1;
	            }
	        }  
	        return result; 
	    }

	    public static boolean canBloom(int[] bloomDay, int m, int k, int mid){
	        int count = 0;
	        int numberOfFlowers = 0;

	        for(int i = 0; i <= bloomDay.length-1; i++){
	            if(bloomDay[i] <= mid){
	                count +=1;
	            }
	            else{
	                numberOfFlowers += (count/k);
	                count = 0;
	            }
	        }
	        numberOfFlowers += (count/k);

	    if(numberOfFlowers >= m) return true;
	    else return false;
	    }
	}

}
