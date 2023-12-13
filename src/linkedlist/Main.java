package linkedlist;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertInLinkedList(1, 0);
        singleLinkedList.insertInLinkedList(2, 1);
        singleLinkedList.insertInLinkedList(3, 2);
        singleLinkedList.insertInLinkedList(4, 3);
        singleLinkedList.insertInLinkedList(5, 4);

//        System.out.println(singleLinkedList.findNode(1).value);
        singleLinkedList.removeAllNode();
        singleLinkedList.traverseLinkedList();
    }
}
