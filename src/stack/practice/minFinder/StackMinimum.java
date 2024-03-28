package stack.practice.minFinder;

import linkedlist.Node;

public class StackMinimum {
    private Node top;
    private Node minimum;

    public StackMinimum() {
        top = null;
        minimum = null;
    }

    public int findMinimum() {
        if (minimum == null) {
            throw new IllegalStateException("Stack is empty.");
        }

        return minimum.value;
    }

    public void push(int value) {
        if (minimum == null || minimum.value >= value) {
            minimum = new Node(value, minimum);
        } else {
            minimum = new Node(minimum.value, minimum);
        }

        top = new Node(value, top);
    }

    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty.");
        }

        minimum = minimum.next;
        int result = top.value;
        top = top.next;

        return result;
    }
}
