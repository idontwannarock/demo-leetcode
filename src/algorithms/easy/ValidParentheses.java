package algorithms.easy;

import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {

    // https://leetcode.com/problems/valid-parentheses/
    // Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
    // determine if the input string is valid.
    //
    // An input string is valid if:
    // Open brackets must be closed by the same type of brackets.
    // Open brackets must be closed in the correct order.
    // Note that an empty string is also considered valid.
    //
    // Example 1:
    // Input: "()"
    // Output: true
    //
    // Example 2:
    // Input: "()[]{}"
    // Output: true
    //
    // Example 3:
    // Input: "(]"
    // Output: false
    //
    // Example 4:
    // Input: "([)]"
    // Output: false
    //
    // Example 5:
    // Input: "{[]}"
    // Output: true
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int head = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack[head++] = c;
                    System.out.println("stack, " + Arrays.toString(stack) + ", with head at " + head);
                    break;
                case '}':
                    if (head == 0 || stack[--head] != '{') return false;
                    System.out.println("stack, " + Arrays.toString(stack) + ", with head at " + head);
                    break;
                case ')':
                    if (head == 0 || stack[--head] != '(') return false;
                    System.out.println("stack, " + Arrays.toString(stack) + ", with head at " + head);
                    break;
                case ']':
                    if (head == 0 || stack[--head] != '[') return false;
                    System.out.println("stack, " + Arrays.toString(stack) + ", with head at " + head);
                    break;
            }
        }
        return head == 0;
    }

    public boolean isValidStack(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> parentheses = new Stack<>();
        for (int index = 0; index < s.length(); index++) {
            char character = s.charAt(index);
            if (character == '(' || character == '[' || character == '{') {
                parentheses.push(character);
            } else if (character == ')') {
                if (!parentheses.isEmpty() && parentheses.peek() == '(') {
                    parentheses.pop();
                } else {
                    return false;
                }
            } else if (character == ']') {
                if (!parentheses.isEmpty() && parentheses.peek() == '[') {
                    parentheses.pop();
                } else {
                    return false;
                }
            } else if (character == '}') {
                if (!parentheses.isEmpty() && parentheses.peek() == '{') {
                    parentheses.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return parentheses.isEmpty();
    }
}
