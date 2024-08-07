class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0]; //Minimum Index
        for(int i=0 ; i < prices.length; i++)
        {
            int cost  = prices[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min (min, prices[i]);
        }
        return profit;
    }
}