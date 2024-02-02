package miu_againn;

import java.util.ArrayList;
import java.util.List;

public class Evens {
    public static int isEvens(int n) {
        char[] value = Integer.toString(n).toCharArray();

        for (int i = 0; i < value.length; i++) {
            if (Integer.parseInt(Integer.toString(value[i])) % 2 != 0) {
                return 0;
            }
        }


        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isEvens(2224));
    }
}
