class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String output = s + s;
        if (output.indexOf(goal) == -1) {
            return false;
        }
        return true;
    }
}