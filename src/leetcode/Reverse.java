package leetcode;

public class Reverse {
    public static int reverseValue(int x) {
        StringBuilder converted = new StringBuilder();

        converted.append(Math.abs(x)).reverse();

        String value = String.valueOf(x < 0 ? "-" + converted : converted);

        return Integer.parseInt(value);
    }

    public static void main(String[] args) {
        System.out.println(reverseValue(1));
    }
}
