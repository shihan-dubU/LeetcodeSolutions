//QN: https://leetcode.com/problems/valid-parentheses/?envType=study-plan-v2&envId=top-interview-150

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            
            if (stack.empty()) {
                stack.push(c); 
            } else if ((c - stack.peek() <= 2) && (c > stack.peek())) {
                // if current c is the CLOSING bracket of the OPENING bracket, we pop from the stack.
                //since we are using characters, we abuse the ascii values
                stack.pop();
            } else {
                if (c == ')' || c == '}' || c == ']' ) {
                    //we cant have an unopened bracket!
                    return false;
                } else {
                    //else we push it to the stack
                    stack.push(c);
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }
}