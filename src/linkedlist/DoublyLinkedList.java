package linkedlist;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createDoublyLinkedList(int value) {
        Node node = new Node();
        node.next = null;
        node.prev = null;
        node.value = value;
        head = node;
        tail = node;
        size = 1;
    }

    public void insert(int value, int location) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            createDoublyLinkedList(value);
            return;
        } else if (location == 0) {
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        } else if (location >= size) {
            node.next = null;
            node.prev = tail;
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
            node.prev = tempNode;

            if (nextNode != null)
                nextNode.prev = node;

        }

        size++;
    }

    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("DLL does not exist");
            return;
        }

        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.value);
            if (currentNode.next != null) System.out.print(" -> ");
            currentNode = currentNode.next;
        }
    }

    public void reverseTraversalLinkedList() {
        if (tail == null) {
            System.out.println("DLL does not exist");
            return;
        }

        Node currentNode = tail;

        while (currentNode != null) {
            System.out.print(currentNode.value);
            if (currentNode.prev != null) System.out.print(" -> ");
            currentNode = currentNode.prev;
        }
    }

    public Node getNode(int value) {
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
        if (head == null) {
            tail = null;
            return;
        }

        if (location == 0) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else {
            Node tempNode = head;

            for (int i = 0; i < location - 1 && tempNode.next != null; i++) {
                tempNode = tempNode.next;
            }

            if (tempNode.next != null) {
                tempNode.next = tempNode.next.next;

                Node afterNode = tempNode.next;

                if (afterNode != null) {
                    afterNode.prev = tempNode;
                }

                if (tempNode.next == null) {
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
        size = 0;
    }
}
