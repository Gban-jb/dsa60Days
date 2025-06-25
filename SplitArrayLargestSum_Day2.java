package dsa60Days;
public class SplitArrayLargestSum_Day2 {
	class Solution {
		public int splitArray(int[] nums, int k) {
			int low = 0;
			int high = 0;
			//1. find the range that is max of the array and the sum of the array because that is the lowest and highest possible way to               get the minimized largest sum of the array.
			//2. Find either the mid value satisfied or not so that it returns or divide the array into the two parts and continue it until you get the minimized largest sum of the array
			//3. Return the minimized sum of the array at last.
			for(int num : nums){
				low = Math.max(low, num); // low = the largest element in the array
				high += num;              // high = the sum of the array.
			}
			// int result = -1;  //Initializing the result
			//While loop for binary search
			while(low <= high){
				int mid = low + (high-low)/2;
				int numSplit = numberOfSplit(nums, mid);
				if(numSplit <= k){
					// result = mid;
					high = mid-1;
				}
				else{
					low = mid+1;
				}
			}
			//return result;
			return low;
		}
		public static int numberOfSplit(int[] nums, int mid){
			int numberSplit = 1;
			int total = 0;
			for(int i = 0; i <= nums.length-1; i++){
				if(nums[i] + total <= mid){
					total+= nums[i];
				}
				else{
					numberSplit++;
					total = nums[i];
				}
			}
			return numberSplit;
		}
	}
}

