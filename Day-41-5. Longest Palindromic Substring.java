//5. Longest Palindromic Substring
//Time Complexity: O(n^2)
class Solution {
    private int start = 0;
    private int maxLen = 0;

    public String longestPalindrome(String s) {

        if (s == null || s.length() < 1) {
            return "";
        }

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            expandFromCenter(s, i, i);

            // Even length palindrome
            expandFromCenter(s, i, i + 1);
        }

        return s.substring(start, start + maxLen);
    }

    private void expandFromCenter(String s, int left, int right) {

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        int len = right - left - 1;

        if (len > maxLen) {
            maxLen = len;
            start = left + 1;
        }
    }
}