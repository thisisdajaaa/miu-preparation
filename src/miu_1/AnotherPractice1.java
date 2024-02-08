package miu_1;

public class AnotherPractice1 {
    public static int isCentered(int[] array) {
        if (array.length % 2 == 0) return 0;

        int middleIndex = array.length / 2;

        for (int i = 0; i < array.length; i++) {
            if (i != middleIndex && array[i] <= array[middleIndex]) {
                return 0;
            }
        }


        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isCentered(new int[] {1, 2, 3, 4, 5}));
    }
}
