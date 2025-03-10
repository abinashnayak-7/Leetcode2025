class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || needle.length() > haystack.length()) {
            return -1; // No valid match can exist
        }

        int n1 = haystack.length();
        int n2 = needle.length();

        // Iterate through s1 to find the first occurrence of s2
        for (int i = 0; i <= n1 - n2; i++) {
            int j;
            // Check if s2 matches at this position in s1
            for (j = 0; j < n2; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break; // Mismatch found, stop checking further
                }
            }
            if (j == n2) {
                return i; // Match found at index i
            }
        }

        return -1; // No match found
    }

}