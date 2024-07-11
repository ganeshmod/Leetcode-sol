class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(current);
                current = new StringBuilder();
            } else if (ch == ')') {
                StringBuilder reversed = current.reverse();
                current = st.pop().append(reversed);
            } else {
                current.append(ch);
            }
        }

        return current.toString();
    }}
