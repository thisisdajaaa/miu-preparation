package linked_list_questions;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();

        linkedList1.createLL(7);
        linkedList1.insertNode(1);
        linkedList1.insertNode(6);

        LinkedList linkedList2 = new LinkedList();

        linkedList2.createLL(5);
        linkedList2.insertNode(9);

//        linkedList.traverseLL();
//
//        System.out.println();
//
//        // remove duplicates
//        RemoveDuplicates.apply(linkedList);
//
//        linkedList.traverseLL();

        // partition
//        LinkedList list = Partition.partition(linkedList, 4);
//
//        System.out.println();
//        list.traversalLL();

        // 1
//        int value = ReturnNthFromLast.getNthFromLast(linkedList, 5);
//        System.out.println(value);

        // sum 2 list
//        LinkedList sum2List = Sum2Lists.sumTwoLists(linkedList1, linkedList2);
//        sum2List.traversalLL();

//        Main.addSameNode(linkedList1, linkedList2, 10);
//        Main.addSameNode(linkedList1, linkedList2, 11);
//        Main.addSameNode(linkedList1, linkedList2, 12);

        // intersection
        Optional<Node> intersection = Optional.ofNullable(Intersection.getIntersection(linkedList1, linkedList2));

        intersection.ifPresent(item -> System.out.println(item.value));
    }

    static void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;
        llA.size++;
        llB.size++;
    }
}
