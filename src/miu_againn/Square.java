package miu_againn;

public class Square {
    public static int isSquare(int n) {
        if (n < 0) return 0;

        double value = Math.sqrt(n);
        return (int) value * (int) value == n ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(25));
    }
}
