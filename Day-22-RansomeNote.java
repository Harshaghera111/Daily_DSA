// 383. Ransom Note
//time complexity: O(m + n) where m and n are the lengths of ransomNote and magazine respectively
import java.util.*;

class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        // count magazine characters
        for(int i = 0; i < magazine.length(); i++) {

            char ch = magazine.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // use characters for ransom note
        for(int i = 0; i < ransomNote.length(); i++) {

            char ch = ransomNote.charAt(i);

            // character not available
            if(!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }

            // consume one character
            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }
}