package dsa60Days;

import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int hours = computeHours(piles, mid);

            if (hours <= h) {
                result = mid;     // mid is a valid speed, try to find smaller
                high = mid - 1;
            } else {
                low = mid + 1;    // too slow, need a bigger speed
            }
        }
        return result;
    }

    private int computeHours(int[] piles, int speed) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1) / speed; // ceil(pile / speed)
        }
        return hours;
    }
}
