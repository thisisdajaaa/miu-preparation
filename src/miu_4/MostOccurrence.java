package miu_4;

import java.util.HashMap;
import java.util.Map;

public class MostOccurrence {
    //	Write a function that will return the most occurring number in an array. If there is more than
//	one such number, the function may return any one of them.
//	If you are programming in Java or C#, the function signature is int answerTwo(int[] a)
//
//	Examples
//	-------------------------|----------|------------------------------------------------------------
//	| a                       | return   | Explanation                                                |
//	|-------------------------|----------|------------------------------------------------------------|
//	| {6,8,1,8,2}             | 8        | 8 occurs two times. No other number occurs 3 or more times |
//	|-------------------------|----------|------------------------------------------------------------|
//  | {6,8,1,8,6}             | 8 or 6   | 8, 6. The Function may return either 8 or 6                |
//	-------------------------|----------|------------------------------------------------------------

    public static int getMostOccurrence(int[] array) {
        Map<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            hashmap.put(array[i], hashmap.containsKey(array[i]) ? hashmap.get(array[i]) + 1 : 1);
        }

        int greatest = 0;
        int key = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> item: hashmap.entrySet()) {
            if (greatest < item.getValue()) {
                greatest = item.getValue();
                key = item.getKey();
            }
        }

        return key;
    }

    public static void main(String[] args) {
        System.out.println(getMostOccurrence(new int[]{6, 8, 6, 8, 2}));
    }


}
