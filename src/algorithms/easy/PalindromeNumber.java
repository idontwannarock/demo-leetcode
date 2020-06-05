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
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }

    // 方法 1: 轉 String 然後用 substring 比較
    // 方法 2: 一樣先 reverse int 然後比較
    // 方法 3: 利用類似非轉 string 的 reverse 過程，邊 reverse 邊比較
    // 方法 4: reverse 一半的數字，然後比較
}
