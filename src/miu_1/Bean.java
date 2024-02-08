package miu_1;

public class Bean {
    public static int isBeanArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 7) {
                boolean found16 = false;

                for (int j = 0; j < array.length; j++) {
                    if (array[j] == 16) {
                        found16 = true;
                        break;
                    }
                }

                if (!found16) return 1;
            }

            if (array[i] == 9) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == 13) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isBeanArray(new int[]{1, 2, 3, 9, 6, 13}));
    }
}
