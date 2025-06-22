package dsa60Days;

public class smallestDivisorUsingThreshold {
	
	public int smallestDivisor(int[] nums, int threshold) {
        // find the range- min and max;
        // find mid; and pass it into the array to find if it is true or not
        // Return true and false by checking if the result is <= threshold or not. 
        //if yes pass it and do the bs. and return the result.

        int left = 1;
        int right = Integer.MIN_VALUE;

        for(int num: nums){
            right = Math.max(right, num);
        }

        int result = -1;
        while(left <= right){
            int mid = left + (right-left)/2;

            if(canDivide(nums, threshold,mid)){
                result = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return result; 
    }

    public static boolean canDivide(int[] nums, int threshold, int mid){
        int divide = 0;
        for(int i = 0; i < nums.length; i++){
            divide += (nums[i] + mid -1) / mid;  //ceil divide
        }
        if(divide <= threshold) return true;
        else return false;
    }

}
