class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); // Sort in ascending order
        int n = citations.length;
        int h = 0;

        for (int i = 0; i < n; i++) {
            int remainingPapers = n - i; // Number of papers with citations[i] or more
            if (citations[i] >= remainingPapers) {
                return remainingPapers; // The H-index is found
            }
        }
        return 0;
    }
}
