// class Solution {
//     public void reverse(int[] nums, int start, int end) {
//         start = 0;
//         end = nums.length - 1;

//         while (start <= end) {
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//         }
//         start++;
//         end--;
//     }

//     public void moveZeroes(int[] nums) {
//         int n = nums.length;
//         Arrays.sort(nums);
//         reverse(nums, 0, n - 1);

//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             if (nums[i] == 0) {
//                 break;
//             } else {
//                 count++;
//             }
//         }

//         reverse(nums, 0, count - 1);
//     }
// }  TIME LIMIT EXCEED


class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Index to place the next non-zero element

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Step 2: Fill the rest of the array with zeros
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
