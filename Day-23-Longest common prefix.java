// 14. Longest Common Prefix
//time complexity: O(S) where S is the sum of all characters in all strings
class Solution {

    public String longestCommonPrefix(String[] strs) {

        // take first string as prefix
        String prefix = strs[0];

        // compare with remaining strings
        for(int i = 1; i < strs.length; i++) {

            // reduce prefix until match found
            while(!strs[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                // no common prefix
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}