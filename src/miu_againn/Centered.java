package miu_againn;

public class Centered {
    public static int isCentered(int[] array) {
        if (array.length % 2 == 0) return 0;

        int middleIndex = array.length / 2;

        for (int i = 0; i < array.length; i++) {
            if (array[middleIndex] >= array[i] && i != middleIndex) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isCentered(new int[] {3, 2, 1, 4, 5}));
    }
}
