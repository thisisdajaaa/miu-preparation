package miu_1;

public class AnotherPractice6 {
    public static int isPOE(int[] array) {
        int totalSum = 0;

        for (int i = 0; i < array.length; i++) {
            totalSum += array[i];
        }

        int leftSum = 0;

        for (int i = 0; i < array.length; i++) {
            totalSum -= array[i];

            if (totalSum == leftSum) {
                return i;
            }

            leftSum += array[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(isPOE(new int[]{1, 8, 3, 7, 10, 2}));
    }
}
