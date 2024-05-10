package stack.practice.queue_via_stack;

public class Main {
    public static void main(String[] args) {
        QueueViaStack newQueue = new QueueViaStack();
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        newQueue.enqueue(4);
        System.out.println(newQueue.peek());
        System.out.println(newQueue.peek());
    }
}
