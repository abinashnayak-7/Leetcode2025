class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer num : nums1) {
            set.add(num);
        }

        HashSet<Integer> intersection = new HashSet<>();
        for (Integer num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }
        int[] result = new int[intersection.size()];
        int i = 0;
        for (Integer num : intersection) {
            result[i++] = num;
        }
        return result;
    }
}