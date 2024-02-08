package miu_1;

public class DaphneArray {
    public static boolean isEven(int n) { return n % 2 == 0; }

    public static int isDaphneArray(int[] array) {
        boolean hasOdd = false;
        int leftEvenCount = 0, rightEvenCount = 0;

        if (!isEven(array[0]) || !isEven(array.length - 1)) return 0;

        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {
                leftEvenCount++;
            } else {
                hasOdd = true;
                break;
            }
        }

        for (int i = array.length - 1; i >= 0 ; i--) {
            if (isEven(array[i])) {
                rightEvenCount++;
            } else {
                break;
            }
        }
        
        return hasOdd && leftEvenCount == rightEvenCount ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isDaphneArray(new int[] {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6}));
    }
}
