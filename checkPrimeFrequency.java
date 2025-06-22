package dsa60Days;

import java.util.Arrays;

public class checkPrimeFrequency {

	class Solution {
	    public boolean checkPrimeFrequency(int[] nums) {
	        Arrays.sort(nums);  // Group duplicates together
	        boolean isPrime = false;

	        for (int i = 0; i < nums.length; ) {
	            int count = 1;

	            // Count frequency using a for loop instead of while
	            int j;
	            for (j = i + 1; j < nums.length; j++) {
	                if (nums[j] == nums[i]) {
	                    count++;
	                } else {
	                    break;
	                }
	            }

	            // Check if count is a prime number
	            if (isPrimeNumber(count)) {
	                isPrime = true;
	                break;
	            }

	            i = j;  // Move to the next unique number
	        }

	        return isPrime;
	    }

	    // Proper prime check
	    private boolean isPrimeNumber(int n) {
	        if (n < 2) return false;
	        for (int i = 2; i * i <= n; i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }
	}


}
