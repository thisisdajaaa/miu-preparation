package miu_1;

public class Balanced {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int isBalanced(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isEven(i) && !isEven(array[i]) || !isEven(i) && isEven(array[i])) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced(new int[] {2, 3, 6, 7}));
    }
}
