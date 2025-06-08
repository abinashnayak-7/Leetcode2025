class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int length = 0;
        int last = n - 1;

        while (last >= 0 && s.charAt(last) == ' ') {
            last--;
        }
        while (last >= 0 && s.charAt(last) != ' ') {
            length++;
            last--;
        }
        return length;
    }
}
