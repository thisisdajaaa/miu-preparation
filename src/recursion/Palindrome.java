package recursion;

public class Palindrome {
    public static boolean isPalindrome(String value) {
        return palindromeHelper(value, 0, value.length() - 1);
    }

    public static boolean palindromeHelper(String value, int start, int end) {
        if (start == end) {
            return true;
        }

        if (value.charAt(start) != value.charAt(end)) {
            return false;
        }

        return palindromeHelper(value, start + 1, end - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("wataw"));
    }
}
