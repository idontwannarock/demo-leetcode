package algorithms.easy;

public class ReverseInteger {

    // https://leetcode.com/problems/reverse-integer/
    //
    // Given a 32-bit signed integer, reverse digits of an integer.
    //
    // Example 1:
    // Input: 123
    // Output: 321
    //
    // Example 2:
    // Input: -123
    // Output: -321
    //
    // Example 3:
    // Input: 120
    // Output: 21
    //
    // Note:

    // Assume we are dealing with an environment which could only store integers
    // within the 32-bit signed integer range: [−231,  231 − 1].
    //
    // For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
    public int reverse(int x) {
        int reversedInt = 0;

        String inputString = String.valueOf(x);

        StringBuilder reversedString = new StringBuilder();
        if (inputString.contains("-")) {
            reversedString.append("-");
        }
        for (int i = inputString.length() - 1; i >= 0; i--) {
            String character = inputString.substring(i, i + 1);
            if (!character.equals("-")) {
                reversedString.append(character);
            }
        }
        try {
            reversedInt = Integer.parseInt(reversedString.toString());
        } catch (NumberFormatException ignore) {}

        return reversedInt;
    }
}
