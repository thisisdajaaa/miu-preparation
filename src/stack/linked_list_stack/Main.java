package stack.linked_list_stack;

import stack.array_stack.Stack;

public class Main {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(13);
        stack.push(1);
        stack.push(11);
        stack.push(14);
        stack.push(15);

        stack.traverseAll();
    }
}
