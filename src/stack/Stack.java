package stack;

public class Stack {
    private int[] stack = new int[5];
    private int top = 0;

    public void push(int data) {
        if (top >= 5) {
            System.out.println("Stack is full");
            return;
        }

        stack[top] = data;
        top++;
    }

    public void show() {
        for (int j : stack) {
            System.out.println(j);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }

        int temp = stack[top - 1];
        stack[top - 1] = 0;
        top--;
        return temp;
    }

    public int peek() {
        return stack[top - 1];
    }

    public boolean isEmpty() { return top == 0; };

    public int size() { return top; }


}
