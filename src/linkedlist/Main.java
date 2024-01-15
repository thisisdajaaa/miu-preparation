package linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static long hamming(int n) {
        List<Long> hammingNumbers = new ArrayList<>();
        hammingNumbers.add(1L);

        int p2 = 0, p3 = 0, p5 = 0;

        while (hammingNumbers.size() < n) {
            long next2 = hammingNumbers.get(p2) * 2;
            long next3 = hammingNumbers.get(p3) * 3;
            long next5 = hammingNumbers.get(p5) * 5;

            long nextHammingNumber = Math.min(next2, Math.min(next3, next5));
            if (!hammingNumbers.contains(nextHammingNumber)) {  // Prevent duplicate entries
                hammingNumbers.add(nextHammingNumber);
            }
            if (nextHammingNumber == next2) p2++;
            if (nextHammingNumber == next3) p3++;
            if (nextHammingNumber == next5) p5++;

        }

        return (hammingNumbers.get(n - 1));
    }

    public static void main(String[] args) {
//        SingleLinkedList singleLinkedList = new SingleLinkedList();
//        singleLinkedList.insertInLinkedList(1, 0);
//        singleLinkedList.insertInLinkedList(2, 1);
//        singleLinkedList.insertInLinkedList(3, 2);
//        singleLinkedList.insertInLinkedList(4, 3);
//        singleLinkedList.insertInLinkedList(5, 4);
//
//        singleLinkedList.removeAllNode();
//        singleLinkedList.traverseLinkedList();
//
//        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
//        circularSinglyLinkedList.insertInLinkedList(1, 0);
//        circularSinglyLinkedList.removeNode(0);
//        circularSinglyLinkedList.traverseLinkedList();

//        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
//        doublyLinkedList.insert(1, 0);
//        doublyLinkedList.removeNode(0);
//        doublyLinkedList.removeAllNode();
//        doublyLinkedList.traverseLinkedList();
        hamming(1692);
    }
}
