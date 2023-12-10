package arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    public int[][] data = null;

    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        data = new int[numberOfRows][numberOfColumns];

        for (int[] datum : data) {
            Arrays.fill(datum, Integer.MIN_VALUE);
        }
    }

    public void insert(int[] location, int value) {
        try {
            if (data[location[0]][location[1]] == Integer.MIN_VALUE) {
                data[location[0]][location[1]] = value;
            } else {
                System.out.println("Value is occupied");
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getItem(int[] location) {
        int value = Integer.MAX_VALUE;

        try {
            value = data[location[0]][location[1]];
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public void traverseArray() {
        for (int[] datum : data) {
            for (int i : datum) {
                System.out.println(i);
            }
        }
    }

    public void searchValue(int value) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == value) {
                    System.out.println("Value is found at row: " + i + " Col: " + j);
                    return;
                }
            }
        }
    }

    public void deleteItem(int[] location) {
        try {
            data[location[0]][location[1]] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
