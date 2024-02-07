package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    static List<List<Integer>> subset(int[] array) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num: array) {
            int size = outer.size();

            for (int i = 0; i < size; i++) {
                List<Integer> initialValue = outer.get(i);
                List<Integer> inner = new ArrayList<>(initialValue);
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
    }

    public static void main(String[] args) {
        System.out.println(subset(new int[]{1, 2, 3}));
    }
}
