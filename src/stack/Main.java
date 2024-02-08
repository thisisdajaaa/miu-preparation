package stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(13);
        stack.push(1);
        stack.push(11);
        stack.push(14);
        stack.push(15);

        stack.pop();

        // stack.show();

        System.out.println(stack.size());
    }
}
