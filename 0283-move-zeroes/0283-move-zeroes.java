class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int nonZeroIdx = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) { //check number is not zero
                nums[nonZeroIdx] = nums[i];
                nonZeroIdx++;
            }
        }

        //for filling zeroes at the end
        for (int i = nonZeroIdx; i < n; i++) {
            nums[i] = 0;
        }
    }
}
