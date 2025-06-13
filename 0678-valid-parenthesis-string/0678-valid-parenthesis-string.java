class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        Stack<Integer> openingBrackets = new Stack<>();
        Stack<Integer> asterisk = new Stack<>();

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                openingBrackets.push(i);
            } else if(ch == '*'){
                asterisk.push(i);
            } else{
                if(!openingBrackets.isEmpty()){
                    openingBrackets.pop();
                }else if(!asterisk.isEmpty()){
                    asterisk.pop();
                }else{
                    return false;
                }
            }
        }

        while(!openingBrackets.isEmpty()){
            if(!asterisk.isEmpty()){
                return false;
            }
            int opening = openingBrackets.pop();
            int closing = asterisk.pop();
            if(opening > closing){
                return false;
            }
        }

        return openingBrackets.isEmpty();
    }
}