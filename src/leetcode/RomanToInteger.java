package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger {
//    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
//    Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
//    The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.

    public static int convertRomanToInteger(String s) {
        int currentValue = 0;

        List<String> words = getStrings(s);

        for (String word : words) {
            if (word.contentEquals("IV")) {
                currentValue += 4;
            }

            if (word.contentEquals("XL")) {
                currentValue += 40;
            }

            if (word.contentEquals("CD")) {
                currentValue += 400;
            }

            if (word.contentEquals("IX")) {
                currentValue += 9;
            }

            if (word.contentEquals("XC")) {
                currentValue += 90;
            }

            if (word.contentEquals("CM")) {
                currentValue += 900;
            }

            if (word.contentEquals("I")) {
                currentValue += 1;
            }

            if (word.contentEquals("V")) {
                currentValue += 5;
            }

            if (word.contentEquals("X")) {
                currentValue += 10;
            }

            if (word.contentEquals("L")) {
                currentValue += 50;
            }

            if (word.contentEquals("C")) {
                currentValue += 100;
            }

            if (word.contentEquals("D")) {
                currentValue += 500;
            }

            if (word.contentEquals("M")) {
                currentValue += 1000;
            }

        }



        return currentValue;
    }

    private static List<String> getStrings(String s) {
        List<String> words = new ArrayList<>();


        for (int i = 0; i < s.length(); i++) {
            String currentLetter = String.valueOf(s.charAt(i));
            String nextLetter = i + 1 < s.length() ? String.valueOf(s.charAt(i + 1)) : "";
            String previousLetter = i > 0 ? String.valueOf(s.charAt(i - 1)) : "";


            if (currentLetter.contentEquals("I") && nextLetter.contentEquals("V")) {
                words.add("IV");
            } else if (currentLetter.contentEquals("X") && nextLetter.contentEquals("L")) {
                words.add("XL");
            } else if (currentLetter.contentEquals("C") && nextLetter.contentEquals("D")) {
                words.add("CD");
            } else if (currentLetter.contentEquals("I") && nextLetter.contentEquals("X")) {
                words.add("IX");
            } else if (currentLetter.contentEquals("X") && nextLetter.contentEquals("C")) {
                words.add("XC");
            } else if (currentLetter.contentEquals("C") && nextLetter.contentEquals("M")) {
                words.add("CM");
            } else if (
                   (currentLetter.contentEquals("V") && previousLetter.contentEquals("I")) ||
                    (currentLetter.contentEquals("L") && previousLetter.contentEquals("X")) ||
                    (currentLetter.contentEquals("D") && previousLetter.contentEquals("C")) ||
                    (currentLetter.contentEquals("X") && previousLetter.contentEquals("I")) ||
                    (currentLetter.contentEquals("C") && previousLetter.contentEquals("X")) ||
                    (currentLetter.contentEquals("M") && previousLetter.contentEquals("C"))
            ) {
                continue;
            } else {
                words.add(currentLetter);
            }
        }
        return words;
    }

    public static void main(String[] args) {
        System.out.println(convertRomanToInteger("MCMXCIV"));
    }
}
