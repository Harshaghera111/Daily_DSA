// 875. Koko Eating Bananas
//Time Complexity: O(n log m) where n is the number of piles and m is the maximum pile size
class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;

        int right = 0;

        // find maximum pile
        for(int pile : piles) {

            right = Math.max(right, pile);
        }

        int ans = right;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            long hours = 0;

            // calculate total hours needed
            for(int pile : piles) {

                hours += Math.ceil((double)pile / mid);
            }

            // valid speed
            if(hours <= h) {

                ans = mid;

                right = mid - 1;
            }

            // too slow
            else {

                left = mid + 1;
            }
        }

        return ans;
    }
}