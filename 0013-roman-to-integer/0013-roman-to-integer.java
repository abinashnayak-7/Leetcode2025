class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int res = hm.get(s.charAt(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            if (hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1))) {
                res -= hm.get(s.charAt(i));
            } else {
                res += hm.get(s.charAt(i));
            }
        }
        return res;
    }
}