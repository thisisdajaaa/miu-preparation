package recursion;

public class stringLength {
    public static int getStringLength(String value) {
        if (value.isEmpty()) return 0;

        return 1 + getStringLength(value.substring(1));
    }

    public static void main(String[] args) {
        String gg = "watafak";

        System.out.println(getStringLength(gg));
    }
}
