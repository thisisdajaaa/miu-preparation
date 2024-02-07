package recursion;

public class Fibo {
    public static int getFibo(int n) {
        if (n <= 1) return n;

        return getFibo(n - 1) + getFibo(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(getFibo(5));
    }
}
