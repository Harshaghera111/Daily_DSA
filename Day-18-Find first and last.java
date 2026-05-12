//34. Find First and Last Position of Element in Sorted Array
//time complexity: O(log n)
class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    // find first occurrence
    public int findFirst(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        int ans = -1;

        while(left <= right) {

            int mid = (left + right) / 2;

            if(nums[mid] == target) {

                ans = mid;

                // continue searching LEFT
                right = mid - 1;
            }

            else if(nums[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    // find last occurrence
    public int findLast(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        int ans = -1;

        while(left <= right) {

            int mid = (left + right) / 2;

            if(nums[mid] == target) {

                ans = mid;

                // continue searching RIGHT
                left = mid + 1;
            }

            else if(nums[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}