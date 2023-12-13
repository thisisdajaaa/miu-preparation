package linkedlist;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;


    public void createSingleLinkedList(int nodeValue) {
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        // No head / initial creation
        if (head == null) {
            createSingleLinkedList(nodeValue);
            return;
            // If attempting to replace head node
        } else if (location == 0) {
            System.out.println("GG1");
            node.next = head;
            head = node;
            // If attempting to insert at last node
        } else if (location >= size) {
            System.out.println("GG2");
            node.next = null;
            tail.next = node; // previous last tail is now pointing to added node
            tail = node;
            // If attempting to insert at a specific location
        } else {
            System.out.println("GG3");
            Node tempNode = head;
            int index = 0;

            // gets the node that is before the specified location
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }


            // insert node in between the beforeNode and afterNode
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }

        size++;
    }

    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("SLL does not exist");
            return;
        }

        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.value);
            if (currentNode.next != null) System.out.print(" -> ");
            currentNode = currentNode.next;
        }
    }

    public Node findNode(int value) {
        Node currentNode = head;
        Node foundNode = null;

        while (currentNode != null) {
            if (currentNode.value == value) {
                foundNode = currentNode;
                break;
            }

            currentNode = currentNode.next;
        }

        return foundNode;
    }

    public void removeNode(int location) {
        if (head == null) { // Check if the list is empty
            return;
        }

        if (location == 0) {
            head = head.next;
            if (head == null) { // List had only one node
                tail = null;
            }
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1 && tempNode.next != null; i++) {
                tempNode = tempNode.next;
            }

            if (tempNode.next != null) {
                tempNode.next = tempNode.next.next;
                if (location == size - 1) { // Removing the tail node
                    tail = tempNode;
                }
            }
        }

        if (size > 0) {
            size--;
        }
    }

    public void removeAllNode() {
        head = null;
        tail = null;
    }
}
