package miu_againn;

public class WaveArray {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int isWaveArray(int[] array) {
        boolean firstValueIsEven = isEven(array[0]);

        for (int i = 0; i < array.length; i++) {
            // odd number should be even
            if (firstValueIsEven) {
                if (isEven(i) && !isEven(array[i]) || !isEven(i) && isEven(array[i])) {
                    return 0;
                }
            // even number should be odd
            } else {
                if (isEven(i) && isEven(array[i]) || !isEven(i) && !isEven(array[i])) {
                    return 0;
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isWaveArray(new int[]{17, 2, 9, 10, 5}));
    }
}
