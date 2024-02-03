package miu_againn;

public class NewMeera {
    public static int isNewMeera(int[] array) {
        boolean foundOne = false, foundNine = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) foundOne = true;
            if (array[i] == 9) foundNine = true;

            if (foundOne && foundNine) return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isNewMeera(new int[]{7, 9, 0,
                10, 1}));
    }
}
