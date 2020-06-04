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
        System.out.println("input in binary: \t" + ("00000000000000000000000000000000" + Integer.toBinaryString(x)).substring(Integer.toBinaryString(x).length()));
        int reversedInt = 0;

        StringBuilder reversed = new StringBuilder();
        if (x < 0) {
            reversed.append("-");
        }
        while (Math.abs(x) > 0) {
            reversed.append(Math.abs(x % 10));
            x /= 10;
        }
        try {
            reversedInt = Integer.parseInt(reversed.toString());
        } catch (NumberFormatException ignore) {}

        System.out.println("output in binary: \t" + ("00000000000000000000000000000000" + Integer.toBinaryString(reversedInt)).substring(Integer.toBinaryString(reversedInt).length()));
        return reversedInt;
    }
}
