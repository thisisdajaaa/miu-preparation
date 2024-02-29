package practice.linked_list;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insert(0, 1);
        doubleLinkedList.insert(1, 2);
        doubleLinkedList.insert(2, 3);


        // doubleLinkedList.insertLast(4);

        doubleLinkedList.showList();
    }
}
