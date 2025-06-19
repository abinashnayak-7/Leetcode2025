class Solution {
    public int differenceOfSums(int n, int m) {
        int sumOfDivisible = 0;
        int sumOfNotDivisible = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sumOfDivisible += i;
            } else {
                sumOfNotDivisible += i;
            }
        }
        return (sumOfNotDivisible - sumOfDivisible);
    }
}