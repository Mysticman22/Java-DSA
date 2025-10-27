import java.util.Stack;

class Parentheses {
    public boolean isValid(String s) {
        // A stack to keep track of opening brackets.
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string.
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it onto the stack.
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); 
            }
            // If it's a closing bracket... 
            else {
                // ...and the stack is empty, it's an invalid string.
                if (stack.isEmpty()) {
                    return false;
                }
                // ...pop the top element and check if it's the matching opening bracket.
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; // Mismatch found.
                }
            }
        }

        // If the stack is empty after the loop, all brackets were matched correctly.
        return stack.isEmpty();
    }
}