package miu_againn;

public class NiceArray {
    public static int isNiceArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int j = 0; j < array.length; j++) {
                if (i != j && (array[i] == array[j] - 1 || array[i] == array[j] + 1)) {
                    count++;
                    break;
                }
            }

            if (count == 0) return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isNiceArray(new int[]{2, 10, 9, 3}));
    }
}
