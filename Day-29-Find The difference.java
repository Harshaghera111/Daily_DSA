// 389. Find the Difference
//Time Complexity: O(n)
import java.util.*;

class Solution {

    public char findTheDifference(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        // count characters of s
        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // check characters in t
        for(int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            // extra character found
            if(!map.containsKey(ch) || map.get(ch) == 0) {
                return ch;
            }

            // reduce frequency
            map.put(ch, map.get(ch) - 1);
        }

        return ' ';
    }
}