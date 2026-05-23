// 448. Find All Numbers Disappeared in an Array
//Time Complexity: O(n)
import java.util.*;

class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int n = nums.length;

        // mark visited indices negative
        for(int i = 0; i < n; i++) {

            int index = Math.abs(nums[i]) - 1;

            if(nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // positive index means missing number
        for(int i = 0; i < n; i++) {

            if(nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}