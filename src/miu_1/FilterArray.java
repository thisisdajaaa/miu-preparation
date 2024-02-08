package miu_1;

public class FilterArray {
    public static int isFilterArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 9) {
                for (int j = 0; j < array.length; j++) {
                    if (i != j && array[j] == 11) {
                        return 1;
                    }
                }
            }

            if (array[i] == 7) {
                boolean has13 = false;

                for (int j = 0; j < array.length; j++) {
                    if (i != j && array[j] == 13) {
                        has13 = true;
                        break;
                    }
                }

                if (!has13) return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isFilterArray(new int[] {3, 4, 6, 7, 14, 16}));
    }
}
