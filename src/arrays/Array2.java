package arrays;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[][] gg = new int[][]{{1,2,3}, {2,3,4}};
        String[][] str = new String[][]{{"G", "2"}};

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(2, 3);

        System.out.println(Arrays.deepToString(twoDimensionalArray.data));
        twoDimensionalArray.insert(new int[] {1, 2}, 2);
        twoDimensionalArray.insert(new int[] {0, 1}, 42);
        twoDimensionalArray.searchValue(2);
        twoDimensionalArray.deleteItem(new int[] {0, 1});
        System.out.println(Arrays.deepToString(twoDimensionalArray.data));
        System.out.println(twoDimensionalArray.getItem(new int[]{1, 2}));
    }
}
