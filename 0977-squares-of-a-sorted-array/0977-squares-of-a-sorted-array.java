class Solution {
    public int square(int n) {
        return n * n;
    }

    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1;
        int i = res.length - 1;
        while (left <= right) {
            if (square(nums[right]) > square(nums[left])) {
                res[i] = square(nums[right]);
                right--;
            } else {
                res[i] = square(nums[left]);
                left++;
            }
            i--;
        }
        return res;
    }
}