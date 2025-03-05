class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int totalProfit = 0;

        for (int i = 0; i < n - 1; i++) {
            if (prices[i] > prices[i + 1]) {
                continue;
            } else {
                int buyPrice = prices[i];
                int sellPrice = prices[i + 1];
                int profit = prices[i + 1] - prices[i];
                totalProfit += profit;
            }
        }
        return totalProfit;
    }
}