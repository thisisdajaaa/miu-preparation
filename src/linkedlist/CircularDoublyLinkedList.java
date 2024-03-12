package linkedlist;

public class CircularDoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void insert(int location, int value) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            head = tail = node;
            head.next = head; // Point to itself to maintain circularity
            head.prev = tail; // Point to itself to maintain circularity
        } else if (location == 0) {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node; // Maintain circular nature
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.prev = tail;
            node.next = head; // Close the loop for circularity
            head.prev = node; // Ensure the head's prev points to the new tail
            tail = node;
        } else {
            Node temp = head;
            for (int i = 0; i < location - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next.prev = node;
            temp.next = node;
            node.prev = temp;
        }
        size++;
    }


    public void traverse() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        Node currentNode = head;
        int count = 0; // Add a safety counter to avoid infinite loops during debugging
        do {
            System.out.print(currentNode.value);
            if (currentNode.next != head) System.out.print(" -> ");
            currentNode = currentNode.next;
            count++;
            if (count > size) {
                break;
            }
        } while(currentNode != head);
        System.out.println(); // Ensure newline at the end
    }


    public Node get(int location) {
        if (isEmpty()) return null;

        Node currentNode = head;
        int index = 0;

        while(index != location) {
            currentNode = currentNode.next;
            index++;
        }

        return currentNode;
    }

    public void remove(int location) {
        if (isEmpty()) return; // List is empty

        // Single element condition
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        // Removing the head
        if (location == 0) {
            head = head.next;
            tail.next = head;
            head.prev = tail;
        }
        // Removing the tail
        else if (location == size - 1) {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
        // Removing a node in the middle
        else {
            Node temp = head;
            for (int i = 0; i < location; i++) {
                temp = temp.next;
            }

            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        size--;
    }



    public boolean isEmpty() {
        return size == 0 && head == null;
    }

    public void removeAll() {
        if (head != null) {
            head = tail = null;
            size = 0;
        }
    }
}