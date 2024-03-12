package linked_list_questions;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.createLL(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(3);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(4);
        linkedList.insert(5);

        // linkedList.traverseLL();

        System.out.println();

        // 1, 2, 3, 4, 5
        RemoveDuplicates.apply(linkedList);

        // linkedList.traverseLL();

        // 1
        int value = ReturnNthFromLast.getNthFromLast(linkedList, 5);
        System.out.println(value);
    }
}
