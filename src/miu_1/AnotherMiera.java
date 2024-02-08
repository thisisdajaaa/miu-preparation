package miu_1;

public class AnotherMiera {
    public static int isMieraArray(int[] array) {
        int totalSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) return 0;

            totalSum += array[i];
        }

        return totalSum == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isMieraArray(new int[] {-4, 0, 1, 0, 2, 1}));
    }
}
