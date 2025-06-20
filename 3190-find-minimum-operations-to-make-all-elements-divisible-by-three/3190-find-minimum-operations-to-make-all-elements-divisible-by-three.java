class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 3 != 0 && nums[i] % 2 != 0) {
                count++;
            } else if (nums[i] % 3 != 0 && nums[i] % 2 == 0) {
                count++;
            } else {
                continue;
            }
        }
        return count;
    }
}