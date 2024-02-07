package recursion;

public class ReverseString {
    public static String reversedString(String value) {
        if (value.isEmpty()) return "";

        return reversedString(value.substring(1)) + value.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reversedString("1234G"));
    }
}
