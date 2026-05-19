// 268. Missing Number
//time complexity: O(n)
class Solution {

    public int missingNumber(int[] nums) {

        int n = nums.length;

        // expected sum from 0 to n
        int expectedSum = n * (n + 1) / 2;

        // actual array sum
        int actualSum = 0;

        for(int num : nums) {
            actualSum += num;
        }

        // missing number
        return expectedSum - actualSum;
    }
}