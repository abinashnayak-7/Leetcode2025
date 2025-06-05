class Solution {
    public int minSwaps(String s) {
        int open = 0, close = 0;
        int swap = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[') {
                open++;
            } else {
                if (open <= 0) {
                    close++;
                } else {
                    open--;
                }
            }
        }
        int pair = (open + close) / 2;
        swap = (pair + 1) / 2;
        return swap;
    }
}