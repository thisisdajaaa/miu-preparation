package recursion;

public class findMaximum {
    public static int getMaximum(int[] array) {
        return getMaximumHelper(array, 0, array[0]);
    }

    public static int getMaximumHelper(int[] array, int index, int currentMax) {
        if (index > array.length - 1) return currentMax;

        if (array[index] > currentMax) currentMax = array[index];

        return getMaximumHelper(array, index + 1, currentMax);
    }

    public static void main(String[] args) {
        System.out.println(getMaximum(new int[]{1, 2, 3, 4}));
    }
}
