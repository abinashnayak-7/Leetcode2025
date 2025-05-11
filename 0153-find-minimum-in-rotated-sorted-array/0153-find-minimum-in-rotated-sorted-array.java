class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid; // Search in the left half
            }
        }

        return nums[left]; // The minimum element
    }
}