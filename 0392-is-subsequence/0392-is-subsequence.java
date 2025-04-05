class Solution {
    public boolean isSubsequence(String s, String t) {
        // Null check for safety
        if (s == null || t == null) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }

        int si = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(si) == t.charAt(i)) {
                si++;
                // Early exit if we've matched all characters of s
                if (si == s.length()) {
                    return true;
                }
            }
        }

        return false; // If not all characters in s were matched
    }
}