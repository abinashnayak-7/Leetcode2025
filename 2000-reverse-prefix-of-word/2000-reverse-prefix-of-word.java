import java.util.Stack;

class Solution {
    public String reversePrefix(String word, char ch) {
        if (word.indexOf(ch) == -1) {
            return word;
        }
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char currCharacter = word.charAt(i);
            stack.push(currCharacter);

            if (currCharacter == ch) {
                // Pop characters to build reversed prefix
                while (!stack.isEmpty()) {
                    res.append(stack.pop());
                }
                // Append the rest of the string and break
                res.append(word.substring(i + 1, word.length()));
                break;
            }
        }
        return res.toString();
    }
}
