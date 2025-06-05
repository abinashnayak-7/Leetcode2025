class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int open = 0, close = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open++;
            } else {
                if (open <= 0) {
                    close++;
                } else {
                    open--;
                }
            }
        }
        return (open + close);
    }
}

//  int n = s.length();
//         Stack<Character> stack = new Stack<>();
//         for (int i = 0; i < n; i++) {
//             char ch = s.charAt(i);
//             if (ch == '(') {
//                 stack.push(ch);
//             } else {
//                 if (stack.isEmpty() || stack.peek() == ')') {
//                     stack.push(ch);
//                 } else {
//                     stack.pop();
//                 }
//             }
//         }
//         return stack.size();