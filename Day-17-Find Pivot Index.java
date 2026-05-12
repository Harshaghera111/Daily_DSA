//724. Find Pivot Index
//time complexity: O(n)
class Solution {

    public int pivotIndex(int[] nums) {

        int n = nums.length;

        int totalSum = 0;

        // calculate total sum
        for(int i = 0; i < n; i++) {
            totalSum = totalSum + nums[i];
        }

        int leftSum = 0;

        for(int i = 0; i < n; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            // pivot found
            if(rightSum == leftSum) {
                return i;
            }

            // update left sum
            leftSum = leftSum + nums[i];
        }

        return -1;
    }
}