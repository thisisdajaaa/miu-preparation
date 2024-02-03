package miu_againn;

import java.util.ArrayList;
import java.util.List;

public class AnotherPractice5 {
    public static int[] getDuplicates(int[] array1, int[] array2) {
        List<Integer> uniqueList = new ArrayList<>();

        for (int j : array1) {
            for (int k : array2) {
                if (j == k && !uniqueList.contains(j)) {
                    uniqueList.add(j);
                }
            }
        }

        return uniqueList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] duplicates = getDuplicates(new int[] {1, 3, 7, 9}, new int[] {7, 1, 9, 3});

        for (int i = 0; i < duplicates.length; i++) {
            System.out.println(duplicates[i]);
        }
    }
}
