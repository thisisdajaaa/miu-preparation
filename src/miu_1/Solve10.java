package miu_1;

public class Solve10 {
    public static int getFactorial(int n) {
        if (n < 0) {
            return -1;
        }

        if (n <= 1) {
            return n;
        }

        return n * getFactorial(n - 1);
    }

    public static int[] getSolve10() {
        int[] items = new int[2];

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (getFactorial(i) + getFactorial(j) == getFactorial(10)) {
                    items[0] = i;
                    items[1] = j;
                    break;
                }
            }
        }

        return items;
    }

    public static void main(String[] args) {
        int[] list = getSolve10();
        for (int j : list) {
            System.out.println(j);
        }
    }
}
