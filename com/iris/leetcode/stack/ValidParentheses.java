package com.iris.leetcode.stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        // Stack to hold opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the string
        for (char c : s.toCharArray()) {
            // Push opening brackets to the stack
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            }
            // For closing brackets, check if it matches the top of the stack
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        // If stack is empty, all brackets are matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();

        // Test cases
        System.out.println(solution.isValid("()"));      // Output: true
        System.out.println(solution.isValid("()[]{}"));  // Output: true
        System.out.println(solution.isValid("(]"));      // Output: false
        System.out.println(solution.isValid("([])"));    // Output: true
    }
}
   /* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.


        Example 1:

        Input: s = "()"

        Output: true

        Example 2:

        Input: s = "()[]{}"

        Output: true

        Example 3:

        Input: s = "(]"

        Output: false

        Example 4:

        Input: s = "([])"

        Output: true



        Constraints:

        1 <= s.length <= 104
        s consists of parentheses only '()[]{}'.*/