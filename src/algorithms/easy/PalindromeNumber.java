package algorithms.easy;

public class PalindromeNumber {

    // https://leetcode.com/problems/palindrome-number/
    // Determine whether an integer is a palindrome.
    // An integer is a palindrome when it reads the same backward as forward.
    //
    // Example 1:
    // Input: 121
    // Output: true
    //
    // Example 2:
    // Input: -121
    // Output: false
    // Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    //
    // Example 3:
    // Input: 10
    // Output: false
    // Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
    //
    // Follow up:
    // Could you solve it without converting the integer to a string?
    public boolean isPalindrome(int x) {
        boolean isPalindrome = true;
        if (x >= 0) {
            int leftBefore = 0;
            int leftDigits = String.valueOf(x).length() - 1;
            int rightDigits = 0;
            while (leftDigits >= rightDigits) {
                System.out.println("x: \t" + x);
                int left = (x - leftBefore) / pow(leftDigits);
                System.out.println("left: \t" + left);
                leftBefore += (left * pow(leftDigits));
                System.out.println("left before: \t" + leftBefore);
                leftDigits -= 1;
                System.out.println("left digits: \t" + leftDigits);

                int right = x % pow(rightDigits + 1) / pow(rightDigits);
                System.out.println("right: \t" + right);
                rightDigits += 1;
                System.out.println("right digits: \t" + rightDigits);
                x = (x / 10) * 10;
                System.out.println("x: \t" + x);

                isPalindrome &= left == right;
                System.out.println("current is palindrome: \t" + isPalindrome);
                System.out.println();
            }
        } else {
            isPalindrome = false;
        }
        return isPalindrome;
    }

    private int pow(int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= 10;
        }
        return result;
    }

    // 方法 1: 轉 String 然後用 substring 比較
    // 方法 2: 一樣先 reverse int 然後比較
    // 方法 3: 利用非轉 string 的 reverse 過程，邊 reverse 邊比較？
}
