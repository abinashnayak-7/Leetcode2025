class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > end) {
                end = piles[i];
            }
        }

        int k = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(piles, mid, h)) {
                k = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return k;
    }

    public boolean isValid(int[] piles, int hours, int h) {
        int totalHours = 0;
        for (int i = 0; i < piles.length; i++) {
            totalHours += piles[i] / hours;
            if (piles[i] % hours != 0) {
                totalHours += 1;
            }
            if (totalHours > h) {
                return false;
            }
        }
        return true;
    }
}