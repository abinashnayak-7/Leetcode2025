class Solution {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; // Start with the first string as the initial prefix
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // Check if the current string contains the prefix
                prefix = prefix.substring(0, prefix.length() - 1); // Shorten the prefix
                if (prefix.isEmpty()) {
                    return ""; // No common prefix found
                }
            }
        }
        return prefix;
    }

}