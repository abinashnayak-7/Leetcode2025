class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            if (hm.containsKey(num)) {
                // If num already exists in the map, increase its count by 1
                hm.put(num, hm.get(num) + 1);
            } else {
                // If num does not exist in the map, insert it with count 1
                hm.put(num, 1);
            }
        }

        int count = 0;
        int maxFreq = Integer.MIN_VALUE;
        for (int freq : hm.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        for (int freq : hm.values()) {
            if (freq == maxFreq)
                count += maxFreq;
        }
        return count;
    }
}