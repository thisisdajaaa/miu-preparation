package miu_practice;

import linkedlist.Node;

import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) {
//        PLinkedList linkedList = new PLinkedList();
//        PNode node1 = new PNode();
//        node1.value = 1;
//        linkedList.add(node1);
//
//        PNode node2 = new PNode();
//        node2.value = 2;
//        linkedList.add(node2);
//
//        PNode node3 = new PNode();
//        node3.value = 3;
//        linkedList.add(node3);
//
//        linkedList.print();
//        System.out.println(linkedList.find(node3));
        int[] items = new int[]{5, 1, 23, 21, 17, 2, 3, 9, 12};
        testForSum(items, 22);
    }
}
