package miu_practice_again;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CharArray {
    //	Write a function that accepts a character array, a zero-based start position and
//	a length. It should return a character array containing lengthCharacters starting with
//	the startCharacter of the input array. The function should do error checking on the start
//	position and the length and return null if the either value is not legal.
//
//	The function signature is:
//	char[] f(char[] a, int start, int len)

    public static char[] getCharArray(char[] array, int start, int len) {
        List<Character> storedList = new ArrayList<>();

        if (array.length < len || array.length < start + len || start < 0 || len < 0) {
            return null;
        }

        if (array.length == 0) {
            return new char[]{};
        }

        for (int i = start; i < start + len; i++) {
                storedList.add(array[i]);

        }


        return storedList.toString().toCharArray();
    }

    public static void main(String[] args) {
        System.out.println(Objects.requireNonNull(getCharArray(new char[]{'a', 'b', 'c'}, 2, 2)));
    }
}
