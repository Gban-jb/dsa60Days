package dsa60Days;
public class FindPeakElement_Day2_BS {
		public int findPeakElement(int[] nums) {
			int low = 1;
			int high = nums.length-2;

			if(nums.length == 1) return 0;
			else if(nums[0] > nums[1]) return 0;
			else if(nums[nums.length-1] > nums[nums.length-2]) return nums.length-1;

			while(low <= high){
				int mid = low + (high-low)/2;
				if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
					return mid;
				}

				else if (nums[mid] < nums[mid + 1]){
					low = mid + 1;
				}
				else if(nums[mid] > nums[mid + 1]){
					high = mid-1;
				}
				else{
					high  = mid-1;
				}
			}
			return -1;
		}
	}
