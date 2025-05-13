class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int low = 0, high = 0;
        int minLength = Integer.MAX_VALUE;
        int currSum = 0;

        for (high = 0; high < nums.length; high++) {
            currSum += nums[high];
            while (currSum >= target) {
                int currLength = high - low + 1;
                minLength = Math.min(minLength, currLength);
                currSum = currSum - nums[low];
                low++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}