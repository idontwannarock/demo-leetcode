package algorithms.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    // https://leetcode.com/problems/longest-common-prefix/
    // Write a function to find the longest common prefix string amongst an array of strings.
    //
    // If there is no common prefix, return an empty string "".
    //
    // Example 1:
    // Input: ["flower","flow","flight"]
    // Output: "fl"
    //
    // Example 2:
    // Input: ["dog","racecar","car"]
    // Output: ""
    // Explanation: There is no common prefix among the input strings.
    //
    // Note:
    // All given inputs are in lowercase letters a-z.
    public String longestCommonPrefix(String[] strs) {
        System.out.println(Arrays.toString(strs));

        String longestCommonPrefix = "";
        if (strs.length > 1) {
            // start compare with first string
            String current = strs[0];
            while (longestCommonPrefix.isBlank() && current.length() > 0) {
                System.out.println("Current test start: " + current);
                boolean isMatched = true;
                for (String str : strs) {
                    if (str.length() < current.length()) {
                        current = str + " ";
                        isMatched = false;
                        break;
                    }
                    isMatched &= str.startsWith(current);
                }
                if (isMatched) {
                    longestCommonPrefix = current;
                } else {
                    // if not matched, cut off the last character
                    current = current.substring(0, current.length() - 1);
                }
            }
        } else if (strs.length == 1) {
            longestCommonPrefix = strs[0];
        }
        return longestCommonPrefix;
    }
}
