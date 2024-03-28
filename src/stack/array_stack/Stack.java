package stack.array_stack;

public class Stack {
    private final int[] elements;
    private int size = 0;
    private final int length;

    public Stack(int length) {
        this.elements = new int[length];
        this.length = length;
    }

    public void push(int value) {
        if (isFull()) return;

        elements[size] = value;
        size++;
    }

    public void pop() {
        if (isEmpty()) return;

        elements[size - 1] = Integer.MIN_VALUE;
        size--;
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0 && elements.length == 0;
    }

    public boolean isFull() {
        return size == length;
    }

    public void traverseAll() {
        for (int element : elements) {
            System.out.println(element);
        }
    }
}
