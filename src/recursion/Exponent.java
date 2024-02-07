package recursion;

public class Exponent {
    public static int getExponent(int n, int times) {
        if (times <= 1) {
            return n;
        }

        return n * getExponent(n, times - 1);
    }

    public static void main(String[] args) {
        System.out.println(getExponent(2, 2));
    }
}
