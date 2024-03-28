package stack.linked_list_stack;

public class StackLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void push(int value) {
        Node newValue = new Node(value);

        if (head == null && size == 0) {
            head = newValue;
            tail = newValue;
        }

        tail.next = newValue;
        tail = newValue;

        size++;
    }

    public void pop() {
        if (isEmpty()) return;

        Node previousValue = peek();

        if (previousValue != null) {
            previousValue.next = null;
            tail = previousValue;
        }

        size--;
    }

    public Node peek() {
        Node currentValue = head;
        Node previousValue = null;

        while (currentValue != null) {
            if (currentValue.next != null) previousValue = currentValue;
            currentValue = currentValue.next;
        }

        if (previousValue != null) {
            return previousValue.next;
        }

        return null;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public void deleteAll() {
        head.next = null;
        head = null;
        tail.next = null;
        tail = null;
        size = 0;
    }

    public void traverseAll() {
        Node currentNode = head;

        while(currentNode != null) {
            System.out.print(currentNode.value);
            if (currentNode.next != null) System.out.print(" -> ");
            currentNode = currentNode.next;
        }
    }
}
