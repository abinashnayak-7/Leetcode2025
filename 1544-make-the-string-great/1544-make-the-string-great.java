class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (!stack.isEmpty() && Math.abs(stack.peek() - curr) == 32) {
                stack.pop(); // Bad pair: same letter different case
            } else {
                stack.push(curr); // Good character
            }
        }

        // Use StringBuilder for better performance
        StringBuilder ans = new StringBuilder();
        for (char c : stack) {
            ans.append(c);
        }

        return ans.toString();
    }
}
