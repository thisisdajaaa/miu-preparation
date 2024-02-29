package practice.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();

        stack.push(4);
        stack.push(5);
        stack.push(6);

        stack.showStackList();
    }
}
