package queue.linked_list;

import linkedlist.Node;

public class Queue {
    private Node head;
    private Node tail;
    private int size = 0;

    Queue(int initialValue) {
        enqueue(initialValue);
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        head = head.next;
        tail = head;

        size--;
    }

    public boolean isEmpty() {
        return size == 0 && head == null;
    }


    public void traverseQueue() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.value);
            if (currentNode.next != null) System.out.print(" -> ");

            currentNode = currentNode.next;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return -1;
        }

        return head.value;
    }

    public void deleteAll() {
        head.next = null;
        head = null;
        tail.next = null;
        tail = null;
        size = 0;
    }
}
