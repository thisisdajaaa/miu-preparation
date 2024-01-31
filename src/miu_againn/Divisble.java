package miu_againn;

public class Divisble {
    public static int isAllDivisible(int[] array, int divisor) {
        for (int j : array) {
            if (j % divisor != 0) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isAllDivisible(new int[] {}, 3));
    }
}
