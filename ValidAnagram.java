//242. Valid Anagram
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//Time complexity: O(n)

class Solution {
    public boolean isAnagram(String s, String t) {

     int [] Count=new int[26];
     if(s.length()!=t.length())
     {
        return false;
     }
     for(int i=0;i<s.length();i++)
     {
        Count[s.charAt(i)-'a']++;
     }
     for(int i=0;i<t.length();i++)
     {
        Count[t.charAt(i)-'a']--;
     }
     for(int i=0;i<26;i++)
     {
        if(Count[i]!=0)
        {
            return false;
        }
     }
     return true;
    }
}