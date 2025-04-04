class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int start = prices[0];
        int n = prices.length;
        for (int i = 1; i < n; i++) {
            if (start < prices[i]) {
                max += prices[i] - start;
            }
            start = prices[i];
        }
        return max;
    }
}