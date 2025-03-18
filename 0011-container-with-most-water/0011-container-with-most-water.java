class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int ht = Math.min(height[left], height[right]);
            int wid = right - left;

            int currentWater = ht * wid; // evaluating area
            maxWater = Math.max(currentWater, maxWater); // updating maxWater

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}