package miu_practice;

import linkedlist.Node;

import java.util.*;

public class Main {
    public static List<String> removeDuplicates(String[] array) {
        List<String> uniqueList = new ArrayList<>();

        for (String item: array) {
            if (!uniqueList.contains(item)) {
                uniqueList.add(item);
            }
        }

        return uniqueList;
    }

    public static boolean testForSum(int[] array, int value) {
        List<Integer> items = new ArrayList<>();
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == value) {
                        items.add(array[i]);
                        items.add(array[j]);
                        items.add(array[k]);
                        flag = true;
                        break;
                    }
                }
            }
        }

        System.out.println(items.toString());

        return flag;
    }

    public static int isOddElementsCentered(int[] array) {
        if (array.length % 2 == 0) {
            return 0;
        }

        double centeredDouble = (double) array.length / 2;
        int centeredIndex = (int) Math.floor(centeredDouble);

        int min = array[centeredIndex];

        Set<Integer> items = new HashSet<>();

        for (int j : array) {
            items.add(j);
        }

        Arrays.sort(array);

        if (array[0] == min && items.size() == array.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int getDifferenceOfOddAndEven(int[] array) {
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evens.add(array[i]);
            } else {
                odds.add(array[i]);
            }
        }

        int totalOfOdds = 0;
        int totalOfEven = 0;

        for (Integer odd : odds) {
            totalOfOdds += odd;
        }

        for (Integer even : evens) {
            totalOfEven += even;
        }

        return totalOfOdds - totalOfEven;
    }

    public static char[] spliced(char[ ] array, int start, int len) {
        if (array.length < len || start > array.length || array.length < (start + len) || start < 0 || len < 0) {
            return null;
        }

        if (len == 0) {
            return new char[]{};
        }


        List<Character> splicedList = new ArrayList<>();

        for (int i = start; i < array.length; i++) {
                splicedList.add(array[i]);
        }


        if (splicedList.isEmpty()) return null;

        return splicedList.toString().toCharArray();
    }

    public static int getReverse(int number) {
        StringBuilder currNumber = new StringBuilder(Integer.toString(Math.abs(number)));
        int finalNum = Integer.parseInt(String.valueOf(currNumber.reverse()));

        return number < 0 ? Integer.parseInt("-" + Integer.toString(finalNum)) : finalNum;
    }

    public static int[] getDuplicates(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return null;
        }

        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    duplicates.add(array1[i]);
                }
            }
        }

        System.out.println(duplicates.toString());


        return duplicates.stream().mapToInt(i -> i).toArray();
    }

    public static int findPOE(int[] array) {
        int totalSum = 0;
        int leftSum = 0;

        for (int j : array) {
            totalSum += j;
        }

        for (int i = 0; i < array.length; i++) {
            totalSum -= array[i];

            if (totalSum == leftSum) {
                return i;
            }

            leftSum += array[i];

        }

        return -1;
    }



    public static void main(String[] args) {
       int[] list = new int[]{1, 2, 3};
        System.out.println(findPOE(list));

    }
}
