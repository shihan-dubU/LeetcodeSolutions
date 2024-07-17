//QN: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int maxProfit(int[] prices) {
        int lowest = prices[0];
        int max_profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < lowest) {
                lowest = prices[i];
            } else {
                if (prices[i] - lowest > max_profit) {
                    max_profit = prices[i] - lowest;
                }
            }
        }
        return max_profit;
    }
}