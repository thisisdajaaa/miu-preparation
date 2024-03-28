package linkedlist;

public class Node {
    public int value;
    public Node prev;
    public Node next;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
