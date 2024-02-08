package miu_1;

public class Centered15 {
    public static int isCentered15(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;

            for (int j = i; j < array.length; j++) {
                sum+= array[j];

                if (sum == 15) {
                    int numElementsLeft = array.length - j - 1;
                    if (i == numElementsLeft) {
                        return 1;
                    }
                }
            }
        }


        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9}));
    }
}
