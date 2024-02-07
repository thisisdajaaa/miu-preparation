package recursion;

public class isArrayAscending {
    public static boolean isAscending(int[] array) {
        return isAscendingHelper(array, 0);
    }

    public static boolean isAscendingHelper(int[] array, int index) {
        if (index > array.length - 1) return true;

        for (int i = index + 1; i < array.length; i++) {
            if (array[index] > array[i]) {
                return false;
            }
        }

        return isAscendingHelper(array, index + 1);

    }

    public static void main(String[] args) {
        System.out.println(isAscending(new int[] {1, 2, 3, 4}));
    }
}
