// 35. Search Insert Position
//time complexity: O(log n)
class Solution {

    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {

            int mid = (left + right) / 2;

            // target found
            if(nums[mid] == target) {
                return mid;
            }

            // move right side
            else if(nums[mid] < target) {
                left = mid + 1;
            }

            // move left side
            else {
                right = mid - 1;
            }
        }

        // insert position
        return left;
    }
}