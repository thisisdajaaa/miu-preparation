package miu_againn;

public class Miera {
    public static int isMieraArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (array[i] * 2 == array[j]) return 0;
                }

            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isMieraArray(new int[] {3, 5, -2} ));
    }
}
