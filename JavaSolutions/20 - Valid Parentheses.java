class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        String openBrackets = "({[";
        String closeBrackets = ")}]";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (openBrackets.contains(c + "")) {
                stack.push(c);
            }
            if (closeBrackets.contains(c + "")) {
                if (stack.size() <= 0) return false;
                char top = stack.pop();
                if (openBrackets.indexOf(top) != closeBrackets.indexOf(c)) return false;
            }
        }

        return stack.size() == 0? true: false;
    }
}