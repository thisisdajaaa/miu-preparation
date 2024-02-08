package miu_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputeDepth {
    public static int getComputedDepth(int n) {
        List<Integer> digits = new ArrayList<>();

        int counter = 1;

        while(digits.size() < 10) {
            int value = n * counter;
            int[] splittedNumbers = Arrays.stream(Integer.toString(value).split("")).mapToInt(Integer::parseInt).toArray();

            for (int splittedNumber : splittedNumbers) {
                if (!digits.contains(splittedNumber)) {
                    digits.add(splittedNumber);
                }
            }


            counter++;

        }

        return counter - 1;
    }

    public static void main(String[] args) {
        System.out.println(getComputedDepth(42));
    }
}
