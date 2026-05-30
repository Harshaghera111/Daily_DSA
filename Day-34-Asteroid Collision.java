// 735. Asteroid Collision
//Time Complexity: O(n)
import java.util.*;

class Solution {

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for(int asteroid : asteroids) {

            boolean destroyed = false;

            // collision condition
            while(!stack.isEmpty() &&
                  stack.peek() > 0 &&
                  asteroid < 0) {

                // top asteroid smaller
                if(stack.peek() < Math.abs(asteroid)) {

                    stack.pop();
                    continue;
                }

                // equal size
                else if(stack.peek() == Math.abs(asteroid)) {

                    stack.pop();
                }

                // current asteroid destroyed
                destroyed = true;
                break;
            }

            // if current survives
            if(!destroyed) {

                stack.push(asteroid);
            }
        }

        // convert stack to array
        int[] ans = new int[stack.size()];

        for(int i = stack.size() - 1; i >= 0; i--) {

            ans[i] = stack.pop();
        }

        return ans;
    }
}