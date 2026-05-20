//Find Peak Element
//Time Complexity: O(log n)
class Solution {

    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {

            int mid = (left + right) / 2;

            // increasing slope
            if(nums[mid] < nums[mid + 1]) {

                left = mid + 1;
            }

            // decreasing slope
            else {

                right = mid;
            }
        }

        return left;
    }
}