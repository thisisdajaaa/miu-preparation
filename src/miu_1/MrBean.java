package miu_1;

public class MrBean {
    public static int isMrBean(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int j = 0; j < array.length; j++) {
                if (i != j && (array[i] == array[j] * 2 || array[i] == array[j] * 2 + 1 || array[i] == array[j] / 2)) {
                    count++;
                    break;
                }
            }

            if (count == 0) return 0;

        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMrBean(new int[] {4, 9, 8}));
    }
}
