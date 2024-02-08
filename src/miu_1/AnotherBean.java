package miu_1;

public class AnotherBean {
    public static int isAnotherBean(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean found = false;

            for (int j = 0; j < array.length; j++) {
                if (i != j && (array[i] == array[j] - 1 || array[i] == array[j] + 1)) {
                    found = true;
                    break;
                }
            }

            if (!found) return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isAnotherBean(new int[] {2, 10, 9, 3}));
    }
}
