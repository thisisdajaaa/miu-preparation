package miu_1;

public class OddHeavy {
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static int isOddHeavy(int[] array) {
        boolean hasOdd = false;

        for (int i = 0; i < array.length; i++) {
            if (isOdd(array[i])) {
                hasOdd = true;

                for (int j = 0; j < array.length; j++) {
                    if (i != j && !isOdd(array[j]) && array[j] > array[i]) {
                        return 0;
                    }
                }
            }
        }

        if (!hasOdd) return 0;

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 8}));
    }
}
