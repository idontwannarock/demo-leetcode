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

        String prefix = "";
        if (strs.length > 1) {
            prefix = strs[0];
            int index = 1;
            while (index < strs.length && prefix.length() > 0) {
                System.out.println("current prefix: " + prefix);
                if (strs[index].startsWith(prefix)) {
                    index++;
                } else {
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
            }
        } else if (strs.length == 1) {
            prefix = strs[0];
        }
        return prefix;
    }
}
