class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr1[i]);
        }

        int freqCount[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            int element = arr1[i];
            freqCount[element]++;
        }
        int j = 0;
        for (int i = 0; i < m; i++) {
            int element = arr2[i];
            while (freqCount[element] > 0) {
                arr1[j++] = element;
                freqCount[element]--;
            }
        }

        for (int i = 0; i < max + 1; i++) {
            while (freqCount[i] > 0) {
                arr1[j++] = i;
                freqCount[i]--;
            }
        }
        return arr1;
    }
}