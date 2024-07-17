//QN: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int currProfit = 0;

        for (int i = 0 ; i < prices.length - 1; i++) {
            if (prices[i+1] > prices[i]) { //future price more than current price , buy
                currProfit += prices[i+1] - prices[i];
            } else { //future price less than or equal current price, sell
                profit += currProfit;
                currProfit = 0;
            }
        }

        if (currProfit > 0) {
            profit += currProfit;
        }

        return profit;
    }
}