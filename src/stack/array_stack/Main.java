package stack.array_stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(13);
        stack.push(1);
        stack.push(11);
        stack.push(14);
        stack.push(15);

        System.out.println(stack.peek());

    }
}
