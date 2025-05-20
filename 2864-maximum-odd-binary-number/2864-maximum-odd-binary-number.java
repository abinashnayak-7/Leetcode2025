class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        char[] res = s.toCharArray();
        int n = res.length;

        // Count occurrences of '1'
        for (char c : res) {
            if (c == '1') {
                count++;
            }
        }

        // Construct the maximum odd binary number
        Arrays.fill(res, '0'); // Fill everything with '0'
        for (int i = 0; i < count - 1; i++) {
            res[i] = '1'; // Place ones at the start
        }
        res[n - 1] = '1'; // Ensure the last digit is '1' to make it odd

        return new String(res);
    }
}