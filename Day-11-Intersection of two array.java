// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
//time complexity: O(n)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
   HashSet<Integer> set=new HashSet<>();
   HashSet<Integer> result=new HashSet<>();
int n1=nums1.length;
int n2=nums2.length;

for(int i=0;i<n1;i++)
{
   set.add(nums1[i]);
}
for(int i=0;i<n2;i++)
{
    if(set.contains(nums2[i]))
    {
        result.add(nums2[i]);
    }
}
 int[] ans = new int[result.size()];
        int index = 0;

        for(int num : result) {
            ans[index] = num;
            index++;
        }

return ans;
    }
}