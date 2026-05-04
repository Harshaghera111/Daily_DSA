// 13. Roman to Integer
//time complexity: O(n)
class Solution {
    public int romanToInt(String s) {
       HashMap<Character,Integer> set=new HashMap<>();
        set.put('I',1);
        set.put('V',5);
        set.put('X',10);
        set.put('L',50);
        set.put('C',100);
        set.put('D',500);
        set.put('M',1000);
 int result=0;
 for(int i=0;i<s.length();i++)
 {
    int current=set.get(s.charAt(i));
    if(i < s.length() - 1 && current < set.get(s.charAt(i + 1))) {
    result -= current;
} else {
    result += current;
}
 }
 return result;
    }
}