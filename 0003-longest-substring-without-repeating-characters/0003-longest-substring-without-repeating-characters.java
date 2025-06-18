class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int windowStart = 0;
        int windowEnd = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        while (windowEnd < n) {
            char ch = s.charAt(windowEnd);
            if (set.contains(ch)) {
                while (windowStart < windowEnd && set.contains(ch)) {
                    set.remove(s.charAt(windowStart));
                    windowStart++;
                }
            } else {
                set.add(ch);
                maxLength = Math.max(maxLength, (windowEnd - windowStart) + 1);
                windowEnd++;
            }
        }
        return maxLength;
    }
}