// 496. Next Greater Element I
//time complexity: O(n + m) where n is the length of nums1 and m is the length of nums2
import java.util.*;

class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        Stack<Integer> stack = new Stack<>();

        // build next greater map from nums2
        for(int num : nums2) {

            while(!stack.isEmpty() && num > stack.peek()) {

                map.put(stack.pop(), num);
            }

            stack.push(num);
        }

        int[] ans = new int[nums1.length];

        // answer for nums1
        for(int i = 0; i < nums1.length; i++) {

            ans[i] = map.getOrDefault(nums1[i], -1);
        }

        return ans;
    }
}