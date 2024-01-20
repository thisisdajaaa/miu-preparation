package leetcode;

public class Palindrome {
    public static boolean isPalindrome(int num) {
        String converted = Integer.toString(num);
        StringBuilder reversed = new StringBuilder();
        reversed.append(num).reverse();

        return converted.contentEquals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
