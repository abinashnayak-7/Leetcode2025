class Solution {
    public int appendCharacters(String s, String t) {
        int lengthOfT = t.length();
        int lengthOfS = s.length();
        int i = 0;
        int j = 0;

        while (i < lengthOfS && j < lengthOfT) {
            //search for odd pair
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }else{
                i++;
            }
        }
        return lengthOfT - j;
    }
}