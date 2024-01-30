package leetcode;

import java.util.*;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start by assuming the whole of the first string is the common prefix
        String prefix = strs[0];

        // Compare the assumed prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Narrow down the prefix until it's no longer a prefix for strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                // Decrease the length of the prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix is empty, no common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println("flow".indexOf("flower"));
        System.out.println(longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
    }
}
