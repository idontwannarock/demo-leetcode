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
        int reversed = 0;

        while (x != 0) {
            int remainder = x % 10;
            x /= 10;
            // int range between 2_147_483_647 ~ -2_147_483_648
            if ((reversed > Integer.MAX_VALUE / 10) ||
                    (reversed == Integer.MAX_VALUE / 10 && remainder > 7)) {
                reversed = 0;
                break;
            }
            if ((reversed < Integer.MIN_VALUE / 10) ||
                    (reversed == Integer.MIN_VALUE / 10 && remainder < -8)) {
                reversed = 0;
                break;
            }
            reversed = reversed * 10 + remainder;
        }

        return reversed;
    }
}
