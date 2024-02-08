package miu_1;

public class LegalNumber {
    public static int isLegalNumber(int[] array, int n) {
        int totalSum = 0;
        int counter = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > n) {
                return 0;
            }

            totalSum += array[i] * (int) Math.pow(n, counter++);
        }

        System.out.println(totalSum);

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isLegalNumber(new int[] {3, 1, 2}, 3));
    }
}
