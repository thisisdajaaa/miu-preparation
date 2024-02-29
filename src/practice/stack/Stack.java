package practice.stack;

public class Stack {
    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        if (stack.length == top) throw new Error("Stack is full!");

        stack[top] = data;
        top++;
    }

    public void pop() {
        if (isEmpty()) throw new Error("Stack is empty!");

        stack[top - 1] = 0;
        top--;
    }

    public void peek() {
        System.out.println(stack[top - 1]);
    }

    public void showStackList() {
        for (int j : stack) {
            System.out.println(j);
        }
    }

    public boolean isEmpty() {
        return stack.length == 0;
    }
}
