// 205. Isomorphic Strings
//time complexity: O(n)
import java.util.*;

class Solution {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // mapping already exists
            if(map.containsKey(c1)) {

                // wrong mapping
                if(map.get(c1) != c2) {
                    return false;
                }
            }

            else {

                // another char already mapped to c2
                if(set.contains(c2)) {
                    return false;
                }

                map.put(c1, c2);
                set.add(c2);
            }
        }

        return true;
    }
}