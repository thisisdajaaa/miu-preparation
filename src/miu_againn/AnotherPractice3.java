package miu_againn;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AnotherPractice3 {
    public static char[] getSlicedStrings(char[] array, int start, int len) {
        List<String> list = new ArrayList<>();

        if (array.length == 0 || array.length < start + len || start < 0) {
            return null;
        }

        for (int i = start; i < start + len; i++) {
            list.add(Character.toString(array[i]));
        }

        return list.toString().toCharArray();
    }

    public static void main(String[] args) {
        char[] list = getSlicedStrings(new char[] {'a', 'b', 'c'}, 2, 1);

        for (int i = 0; i < Objects.requireNonNull(list).length; i++) {
            System.out.println(list[i]);
        }
    }
}
