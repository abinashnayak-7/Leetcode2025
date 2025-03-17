class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = 0;
        int currentProduct = 1;

        for (int i = 0; i < n; i++) {
            currentProduct *= nums[i];
            maxProduct = Math.max(maxProduct, currentProduct);
        }

        return maxProduct;
    }
}