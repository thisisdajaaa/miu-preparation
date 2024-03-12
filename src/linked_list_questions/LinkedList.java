package linked_list_questions;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createLL(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size++;
    }

    public void insert(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void traverseLL() {
        Node currentNode = head;

        while(currentNode != null) {
            System.out.print(currentNode.value);
            if (currentNode.next != null) System.out.print(" -> ");
            currentNode = currentNode.next;
        }
    }

    public void clearAll() {
        head.next = null;
        head = null;
        tail.next = null;
        tail = null;
        size = 0;
    }
}
