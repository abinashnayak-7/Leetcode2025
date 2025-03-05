class Solution {
    public boolean canJump(int[] nums) {
        int maxIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxIdx) {
                return false; // If we can't reach this index, return false.
            }
            maxIdx = Math.max(maxIdx, i + nums[i]); // Update the farthest we can reach.
        }
        return true; // If we can traverse the loop, return true.
    }
}
