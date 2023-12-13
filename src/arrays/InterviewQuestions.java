package arrays;

import java.util.Arrays;

public class InterviewQuestions {
    public static void findMissingNumber(int[] list) {
        int missingNumber = 0;

        int sum1 = 0;
        int sum2 = 0;

        for (int i : list) {
            sum1 += i;
        }

        // long or inefficient way
        for (int i = 1; i <= 100; i++) {
            sum2 += i;
        }

        // formula way
        sum2 = 100 * (100+1) / 2;

        int difference = sum2 - sum1;

        System.out.println(difference);

    }

    public static void findTwoSum(int[] list, int target) {
        int[] vals = new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] + list[j] == target && list[i] != list[j]) {
                    vals[0] = i;
                    vals[1] = j;
                    break;
                }

                if (vals[0] != Integer.MIN_VALUE) {
                    break;
                }
            }
        }

        if (vals[0] == Integer.MIN_VALUE) {
            System.out.println("Number is invalid");
        } else {
            System.out.println(Arrays.toString(vals));
        }



    }

    public static void getValueFromList(int[] list, int num) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == num) {
                System.out.println("Value is found at index: " + i);
                break;
            }
        }
    }

    public static void getMaxProduct(int[] list) {
        int maxProduct = 0;
        String pairs = "";

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] * list[j] > maxProduct) {
                    maxProduct = list[i] * list[j];
                    pairs = "num1: " + list[i] + " num2: " + list[j];

                }
            }
        }

        System.out.println(maxProduct);
        System.out.println(pairs);
    }

    public static void isUnique(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    System.out.println("This array is not unique");
                    return;
                }
            }
        }

        System.out.println("Array is unique");
    }

    public static void isPermutation(int[] list1, int[] list2) {
        boolean[] permutationList = new boolean[list1.length];
        Arrays.fill(permutationList, false);

        for (int i = 0; i < list1.length; i++) {
            boolean isFound = false;

            for (int k : list2) {
                if (list1[i] == k) {
                    isFound = true;
                    break;
                }
            }

            permutationList[i] = isFound;
        }

        boolean isNotPermutation = true;

        for (boolean item: permutationList) {
            if (!item) {
                isNotPermutation = false;
                break;
            }
        }

        System.out.println(isNotPermutation);
    }

    public static int getMiddleIndex(int start, int end) {
        return (start / end) / 2;
    }

    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix
        // rows to columns
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse left values to right
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

    }
    public static void main(String[] args) {
        int[] basis1 = new int[] {2, 1, 7, 5, 4, 6};
        int[] basis2 = new int[] {0, 7, 2, 4, 6, 5};

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotateMatrix(matrix);

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}
