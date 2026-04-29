//time complexity: O(n)
//Problem is about finding the maximum profit that can be achieved by buying and selling a stock given an array of prices where the i-th element is the price of the stock on day i. The solution uses a single pass approach to keep track of the minimum price seen so far and calculates the potential profit at each step, updating the maximum profit accordingly.
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0];
        int maxprofit=0;
        for(int i=0;i<n;i++)
        {
             if(prices[i]<min)
             {
                min=prices[i];
             }
             
        
        int profit=prices[i] -min;
        if(profit>maxprofit)
        {
            maxprofit=profit;

               }
                      }
        return maxprofit;
    }
}