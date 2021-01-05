package algorithms.easy;

import java.util.Arrays;
import java.util.Set;

import static java.util.Comparator.comparingLong;
import static java.util.stream.Collectors.toSet;

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

    public String longestCommonPrefix2(String[] strs) {
        System.out.println(Arrays.toString(strs));

        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        } else {
            var prefix = "";
            int index = 1;
            try {
                int finalIndex = index;
                Set<String> prefixes = Arrays.stream(strs).map(str -> str.substring(0, finalIndex)).collect(toSet());
                while (prefixes.size() == 1) {
                    prefix = strs[0].substring(0, index);
                    index++;
                    int finalIndex1 = index;
                    prefixes = Arrays.stream(strs).map(str -> str.substring(0, finalIndex1)).collect(toSet());
                }
            } catch (IndexOutOfBoundsException ignore) {}
            return prefix;
        }
    }

    public String longestCommonPrefix3(String[] strs) {
        // find shortest string
        String shortestString = findShortestString(strs);
        // check if every strings starts with the shortest string
        if (shortestString.length() != 0 && !isAllPrefixWith(strs, shortestString)) {
            // the shortest string will be the answer if yes
            // otherwise, compare shortest string without one letter on the back at a time
            // with other strings util a match or no match
            do {
                shortestString = shortestString.substring(0, Math.max(0, shortestString.length() - 1));
                if (isAllPrefixWith(strs, shortestString)) {
                    return shortestString;
                }
            } while (shortestString.length() > 0);
        }
        return shortestString;
    }

    private String findShortestString(String[] strs) {
        if (strs.length == 0) return "";
        String shortestString = strs[0];
        for (int index = 1; index < strs.length; index++) {
            if (strs[index].length() < shortestString.length()) {
                shortestString = strs[index];
            }
        }
        return shortestString;
    }

    private boolean isAllPrefixWith(String[] strs, String shortestString) {
        boolean isAllPrefix = true;
        for (String str : strs) {
            isAllPrefix &= str.startsWith(shortestString);
        }
        return isAllPrefix;
    }
}
