//202. Happy Number
//time complexity: O(log n)
import java.util.*;

class Solution {

    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while(n != 1) {

            // cycle detected
            if(set.contains(n)) {
                return false;
            }

            set.add(n);

            int sum = 0;

            // calculate square sum of digits
            while(n > 0) {

                int digit = n % 10;

                sum = sum + (digit * digit);

                n = n / 10;
            }

            n = sum;
        }

        return true;
    }
}