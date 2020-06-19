package algorithms.easy;

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
        if (s.length() % 2 != 0) {
            return false;
        }
        int bracketsBalance = 0;
        int squareBracketsBalance = 0;
        int curlyBracketsBalance = 0;
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == '(') {
                bracketsBalance += 1;
            } else if (s.charAt(index) == ')') {
                bracketsBalance -= 1;
            } else if (s.charAt(index) == '[') {
                squareBracketsBalance += 1;
            } else if (s.charAt(index) == ']') {
                squareBracketsBalance -= 1;
            } else if (s.charAt(index) == '{') {
                curlyBracketsBalance += 1;
            } else if (s.charAt(index) == '}') {
                curlyBracketsBalance -= 1;
            }
            if (bracketsBalance < 0 || squareBracketsBalance < 0 || curlyBracketsBalance < 0) {
                return false;
            }
        }
        return bracketsBalance == 0 && squareBracketsBalance == 0 && curlyBracketsBalance == 0;
    }
}
