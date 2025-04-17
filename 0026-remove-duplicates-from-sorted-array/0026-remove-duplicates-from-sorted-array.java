// class Solution {
//     public int removeDuplicates(int[] nums) {
//       if(nums.length == 0){ //edge case
//             return 0;
//         }
//         int n = nums.length;
//         int k = 0;
//         for(int i = 0; i < n; i++){
//             if(nums[i] != nums[k]){
//                 k++;
//                 nums[k] = nums[i]; 
//             }
//         }
//         return k + 1;
//     }
// }


class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
 