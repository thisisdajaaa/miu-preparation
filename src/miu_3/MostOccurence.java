package miu_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostOccurence {
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

    public static int findMostOccurrence(int[] array) {
        Map<Integer, Integer> mappedItems = new HashMap<>();

        for (int j : array) {
            mappedItems.put(j, mappedItems.containsKey(j) ? mappedItems.get(j) + 1 : 1);
        }

            List<Integer> max = new ArrayList<>();
            List<Integer> keys = new ArrayList<>();

            for (Map.Entry<Integer, Integer> item : mappedItems.entrySet()) {
                if (item.getValue() > 1) {
                    keys.add(item.getKey());
                    max.add(item.getValue());

                }
            }

            if (max.isEmpty() && keys.isEmpty()) {
                return 0;
            }

            int highestOccurrence = keys.get(0);

            for (Integer integer : max) {
                if (highestOccurrence < integer) {
                    highestOccurrence = integer;
                }
            }

            return highestOccurrence;
        }

    public static void main(String[] args) {
        System.out.println(findMostOccurrence(new int[]{6,8,1,8,6}));
    }
}
