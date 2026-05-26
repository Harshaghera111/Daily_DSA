// 739. Daily Temperatures
//timne: O(n)
import java.util.*;

class Solution {

    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;

        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {

            // warmer temperature found
            while(!stack.isEmpty() &&
                  temperatures[i] > temperatures[stack.peek()]) {

                int index = stack.pop();

                ans[index] = i - index;
            }

            // store current index
            stack.push(i);
        }

        return ans;
    }
}