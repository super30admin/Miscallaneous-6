// Problem 309. Best Time to Buy and Sell Stock with Cooldown
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int n = prices.length;
        int hold = -prices[0]; // Profit when holding a stock
        int sell = 0;          // Profit when selling a stock
        int rest = 0;          // Profit when in cooldown

        for (int i = 1; i < n; i++) {
            int prevSell = sell; // Store previous sell value
            sell = hold + prices[i];
            hold = Math.max(hold, rest - prices[i]);
            rest = Math.max(rest, prevSell);
        }

        return Math.max(sell, rest);
    }
}