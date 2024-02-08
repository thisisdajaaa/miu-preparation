package miu_1;

public class RepsEqual {
    public static int isRepsEqual(int[] array, int n) {
        char[] value = Integer.toString(n).toCharArray();
        int[] converted = new int[value.length];

        for (int i = 0; i < value.length; i++) {
            converted[i] = Integer.parseInt(Character.toString(value[i]));
        }

        for (int i = 0; i < array.length; i++) {
            if (array[0] == 0) {
                continue;
            }

            if (array[i] != converted[i]) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isRepsEqual(new int[] {0, 3, 2, 0, 5, 3}, 32053));
    }
}
