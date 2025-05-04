class Solution {
    public void reverse(char[] st) {
        int f = 0;
        int l = st.length - 1;

        while (f < l) {
            char temp = st[f]; 
            st[f] = st[l]; 
            st[l] = temp;

            f++;
            l--;
        }
    }

    public void reverseString(char[] s) {
        reverse(s);
    }
}