// 977. Squares of a Sorted Array
//time complexity: O(n)
class Solution {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;

        int index = n - 1;

        while(left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            // bigger square goes at end
            if(leftSquare > rightSquare) {

                ans[index] = leftSquare;
                left++;
            }

            else {

                ans[index] = rightSquare;
                right--;
            }

            index--;
        }

        return ans;
    }
}