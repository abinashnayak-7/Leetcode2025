class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int ht = Math.min(height[left], height[right]);
            int wd = right - left;

            int currWater = ht * wd;
            maxWater = Math.max(currWater, maxWater);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}