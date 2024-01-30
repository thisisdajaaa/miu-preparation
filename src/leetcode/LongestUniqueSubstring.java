package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LongestUniqueSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            // If the set doesn't contain the current character, add it and move the right pointer forward
            if (!chars.contains(currentChar)) {
                chars.add(currentChar);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                // If the set contains the current character, remove the leftmost character and move the left pointer forward
                chars.remove(s.charAt(left));
                left++;
            }
        }

        System.out.println(chars.size());

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
