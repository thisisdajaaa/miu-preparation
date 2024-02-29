package practice.linked_list;

public class DoubleLinkedList {
    DoubleNode head;
    DoubleNode tail;
    int size = 0;

    public void insert(int location, int data) {
        DoubleNode node = new DoubleNode(data);

        // if list is still null
        if (head == null) {
            node.next = null;
            node.prev = null;
            head = node;
            tail = node;
            // if item to be inserted is at the head
        } else if (location == 0) {
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
            // if item to be inserted is at the end
        } else if (location >= size) {
            node.next = null;
            node.prev = tail;
            tail.next = node;
            tail = node;
        } else {
            DoubleNode currentNode = head;
            int index = 0;

            // Get previous value
            while (index < location - 1) {
                currentNode = currentNode.next;
                index++;
            }

            DoubleNode nextNode = currentNode.next;
            node.prev = currentNode;
            node.next = nextNode;
            currentNode.next = node;

            if (nextNode != null) {
                nextNode.prev = node;
            }
        }

        size++;
    }

    public void insertLast(int data) {
        DoubleNode node = new DoubleNode(data);

        if (head == null) {
            node.next = null;
            node.prev = null;
            head = node;
            tail = node;
        } else {
            DoubleNode currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            System.out.println(currentNode);

            currentNode.next = node; // tail
            node.prev = currentNode; // point to previous tail
            node.next = null;
        }


        size++;


    }

    public void showList() {
        DoubleNode currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data);

            if (currentNode.next != null) System.out.print(" -> ");

            currentNode = currentNode.next;
        }
    }
}
