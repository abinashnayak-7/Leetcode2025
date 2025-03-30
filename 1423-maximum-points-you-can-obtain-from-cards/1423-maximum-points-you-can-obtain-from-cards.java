class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;

        // Calculate the total sum of all elements
        for (int i = 0; i < n; i++) {
            totalSum += cardPoints[i];
        }

        // Find the minimum sum of a subarray of size n - k
        int subarraySize = n - k;
        int currSum = 0;

        // Initialize the sum of the first subarray
        for (int i = 0; i < subarraySize; i++) {
            currSum += cardPoints[i];
        }

        int minSubarraySum = currSum;

        // Slide the window through the array
        for (int i = subarraySize; i < n; i++) {
            currSum += cardPoints[i] - cardPoints[i - subarraySize]; // Add new element, subtract old element
            minSubarraySum = Math.min(minSubarraySum, currSum); // Update the minimum sum
        }

        // The maximum score is the total sum minus the minimum subarray sum
        return totalSum - minSubarraySum;
    }
}