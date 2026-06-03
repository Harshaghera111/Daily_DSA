// 1512. Number of Good Pairs
//Time Complexity: O(n)
import java.util.*;

class Solution {

    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int pairs = 0;

        for(int num : nums) {

            pairs += map.getOrDefault(num, 0);

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return pairs;
    }
}