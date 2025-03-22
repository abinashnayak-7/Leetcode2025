class Solution {
    public int findLeftIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (arr[mid] == target) {
                index = mid;

            }
        }
        return index;
    }

    public int findRightIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (arr[mid] == target) {
                index = mid;
            }
        }
        return index;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findLeftIndex(nums, target);
        result[1] = findRightIndex(nums, target);

        return result;
    }
}