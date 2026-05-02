// 424. Longest Repeating Character Replacement
//time complexity: O(n)
class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        
        int i = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for(int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            count[c - 'A']++;
            
            maxFreq = Math.max(maxFreq, count[c - 'A']);

            while((j - i + 1) - maxFreq > k) {
                count[s.charAt(i) - 'A']--;
                i++;
            }

            maxLength = Math.max(maxLength, j - i + 1);
        }

        return maxLength;
    }
}