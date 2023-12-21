package linkedlist;

public class Main {
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

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insert(1, 0);
        doublyLinkedList.removeNode(0);
        doublyLinkedList.removeAllNode();
        doublyLinkedList.traverseLinkedList();
    }
}
