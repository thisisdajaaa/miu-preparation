package miu_practice_2;

import java.util.ArrayList;
import java.util.List;

public class CharArray {
//	Write a function that accepts a character array, a zero-based start position and
//	a length. It should return a character array containing lengthCharacters starting with
//	the startCharacter of the input array. The function should do error checking on the start
//	position and the length and return null if the either value is not legal.
//
//	The function signature is:
//	char[] f(char[] a, int start, int len)


    public static char[] isCharArray(char[] array, int start, int len) {
        if (array.length < len || start > array.length || array.length < (start + len) || start < 0 || len < 0) {
            return null;
        }

        if (len == 0) {
            return new char[]{};
        }

        List<Character> splicedList = new ArrayList<>();

        // Populate the list with the required elements
        for (int i = start; i < start + len; i++) {
            splicedList.add(array[i]);
        }


        return splicedList.toString().toCharArray();
    }

    public static void main(String[] args) {
        System.out.println(isCharArray(new char[]{'a','b','c'}, 0, 3));
    }
}
