// 347. Top K Frequent Elements
//time complexity: O(n * k) where n is the number of elements in the array and k is the number of top frequent elements we want to find
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequencies
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // store answer
        int[] ans = new int[k];
        int index = 0;

        // repeat k times
        while(index < k) {

            int maxFreq = 0;
            int element = 0;

            // find max frequency element
            for(int key : map.keySet()) {

                if(map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    element = key;
                }
            }

            ans[index] = element;
            index++;

            // remove so it doesn't come again
            map.remove(element);
        }

        return ans;
    }
}