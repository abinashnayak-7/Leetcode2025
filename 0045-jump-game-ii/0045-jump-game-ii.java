class Solution {
    public int jump(int[] nums) {
        int maxIdx = 0;
        int count = 0;
        if (nums.length <= 1) {
            return 0;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (i > maxIdx) {
                return count;
            } else {
                maxIdx = Math.max(maxIdx, i + nums[i]);
                count++;
                if (maxIdx == nums.length - 1) {
                    break;
                }
            }
        }
        return count;
    }
}