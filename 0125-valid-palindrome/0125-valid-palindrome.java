class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();

        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Check if character is a digit or letter using ASCII values
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                // Convert uppercase to lowercase using ASCII
                if (c >= 'A' && c <= 'Z') {
                    c = (char) (c + 32); // Add 32 to convert to lowercase
                }
                newString += c;
            }
        }

        // check if string is palindrome or not
        int start = 0;
        int end = newString.length() - 1;
        while (start <= end) {
            if (newString.charAt(start) != newString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}