class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // for same array length
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // for different array length
        int[] newNum = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            newNum[0] = 1;
        }
        return newNum;
    }
}
