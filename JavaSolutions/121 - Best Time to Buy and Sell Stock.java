class Solution {
    public int maxProfit(int[] prices) {
        int buyIndex = 0;
        int sellIndex = 1;
        int maxProfit = 0;
        if (prices.length <= 1) return 0;
        while(sellIndex < prices.length) {
            maxProfit = Math.max(maxProfit, prices[sellIndex] - prices[buyIndex]);
            if (prices[buyIndex] > prices[sellIndex]) {
                buyIndex = sellIndex;
            }

            sellIndex++;
        }

        return maxProfit;
    }
}