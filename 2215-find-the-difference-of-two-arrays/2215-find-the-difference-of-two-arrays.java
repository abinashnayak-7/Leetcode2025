class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(Integer num : nums1) set1.add(num);
        for(Integer num : nums2) set2.add(num);

        LinkedList<Integer> list1 = new LinkedList<>();
        for(Integer num : set1){
            if(!set2.contains(num)){
                list1.add(num);
            }
        }

         LinkedList<Integer> list2 = new LinkedList<>();
        for(Integer num : set2){
            if(!set1.contains(num)){
                list2.add(num);
            }
        }
        return Arrays.asList(list1, list2);
    }
}