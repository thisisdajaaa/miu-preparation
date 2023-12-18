package linkedlist;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;


    public void createCircularSinglyLinkedList(int value) {
        Node node = new Node();
        node.next = node;
        node.value = value;
        head = node;
        tail = node;
        size = 1;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) {
            createCircularSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            node.next = head;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;

            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }

            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }

        size++;
    }

    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("CSLL does not exist");
            return;
        }
        Node tempNode = head;

        do {
            System.out.print(tempNode.value + " -> ");
            tempNode = tempNode.next;
        } while (tempNode != head);

    }

    public Node findNodeByIndex(int index) {
        Node tempNode = head;
        int idx = 0;

        while (idx != index) {
            tempNode = tempNode.next;
            idx++;
        }

        return tempNode;
    }

    public Node findNodeByValue(int value) {
        Node currentNode = head;
        Node foundNode = null;

        do {
            if (currentNode.value == value) {
                foundNode = currentNode;
                break;
            }

            currentNode = currentNode.next;
        } while (currentNode != head);

        return foundNode;
    }

    public void removeNode(int location) {
        if (head == null) {
            return;
        }

        if (location == 0) {
            if (size > 1) {
                head = head.next;
                tail.next = head;
            } else {
                removeAll();
            }

        } else {
            Node tempNode = head;
            int index = 0;

            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }

            if (location == size - 1) {
                tail = tempNode;
                tail.next = head;
            } else {
                tempNode.next = tempNode.next.next;
            }

        }

        if (size > 0) {
            size--;
        }
    }

    public void removeAll() {
        head = null;
        tail.next = null;
        tail = null;
        size = 0;
    }
}
