package miu_1;

public class NextPerfectSquare {
    public static boolean isPerfectSquare(int n) {
        double value = Math.sqrt(n);
        return (int) value * (int) value == n;
    }

    public static int getNextPerfectSquare(int n) {
        if (n < 0) {
            return 0;
        }

        int counter = n + 1;

        while(true) {
            if (isPerfectSquare(counter)) {
                return counter;
            }

            counter++;
        }

    }

    public static void main(String[] args) {
        System.out.println(getNextPerfectSquare(0));
    }
}
