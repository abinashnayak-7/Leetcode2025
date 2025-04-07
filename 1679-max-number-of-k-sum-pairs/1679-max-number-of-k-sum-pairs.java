class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums); // Sort the array
        int left = 0, right = nums.length - 1; // Initialize two pointers
        int count = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                count++; // Found a pair
                left++;
                right--; // Move both pointers inward
            } else if (sum < k) {
                left++; // Increase the smaller number
            } else {
                right--; // Decrease the larger number
            }
        }

        return count;
    }
}