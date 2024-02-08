package miu_4;

import java.util.Arrays;

public class Anagram {
    //	One word is an anagram of another word if it is a rearrangement of all the letters of the second word.
//	For example, the character arrays {'s', 'i', 't'} and {'i', 't', 's'} represent words that are anagrams
//	of one another because "its" is a rearrangement of all the letters of "sit" and vice versa.
//	Write a function that accepts two character arrays and returns 1 if they are anagrams of one another,
//	otherwise it returns 0. For simplicity, if the two input character arrays are equal, you may consider them to be anagrams
//
//	If you are programming in Java or C#, the function signature is:
//	int areAnagrams(char [ ] a1, char [ ] a2)
//	If you are programming in C or C++, the function signature is
//	int areAnagrams(a1 char[ ], a2 char[ ], int len) where len is the length of a1 and a2.
//	Hint: Please note that "pool" is not an anagram of "poll" even though they use the same letters.
//	Please be sure that your function returns 0 if given these two words! You can use another array to
//	keep track of each letter that is found so that you don't count the same letter twice (e.g., the attempt
//	to find the second "o" of "pool" in "poll" should fail.)
//	Hint: do not modify either a1 or a2, i.e., your function should have no side effects!
//	If your algorithm requires modification of either of these arrays, you must work with a copy of the array and modify the copy!
//	Examples
//	if input arrays are return
//	{'s', 'i', 't'} and {'i', 't', 's'} 1
//	{'s', 'i', 't'} and {'i', 'd', 's'} 0
//	{'b', 'i', 'g'} and {'b', 'i', 't'} 0
//	{'b', 'o', 'g'} and {'b', 'o', 'o'} 0
//	{} and {} 1
//	{'b', 'i', 'g'} and {'b', 'i', 'g'} 1

    public static int isAnagram(char[] array1, char[] array2) {
        char[] newArray1 = new char[array1.length];
        char[] newArray2 = new char[array2.length];

        if (array1.length != array2.length) return 0;

        for (int i = 0; i < array1.length; i++) {
            newArray1[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            newArray2[i] = array2[i];
        }

        Arrays.sort(newArray1);
        Arrays.sort(newArray2);

        for (int i = 0; i < newArray1.length; i++) {
            if (newArray1[i] != newArray2[i]) {
                return 0;
            }
        }


        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram(new char[] {'s', 'i', 't'}, new char[] {'s', 't', 'i'}));
    }
}
