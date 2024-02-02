package miu_againn;

import java.util.ArrayList;
import java.util.List;

public class Fill {
    public static int[] fillArray(int[] array, int k, int n) {
        int[] grabbedItems = new int[k];

        if (k == 0) {
            return null;
        }

        for (int i = 0; i < k; i++) {
            grabbedItems[i] = array[i];
        }

        List<Integer> list = new ArrayList<>();

        while (true) {
            for (int i = 0; i < grabbedItems.length; i++) {
                if (list.size() == n) {
                    return list.stream().mapToInt(val -> val).toArray();
                }

                list.add(grabbedItems[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] items = fillArray(new int[]{4, 2, -3, 12}, 1, 5);

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

}
