class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the middle element is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (nums[left] <= nums[mid]) {
                // Target is in the sorted left half
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // Narrow the search to the left half
                } else {
                    left = mid + 1; // Narrow the search to the right half
                }
            } 
            // Otherwise, the right half must be sorted
            else {
                // Target is in the sorted right half
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // Narrow the search to the right half
                } else {
                    right = mid - 1; // Narrow the search to the left half
                }
            }
        }

        // Target not found
        return -1;
    }
}