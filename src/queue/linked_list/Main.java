package queue.linked_list;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.peek());

        // queue.traverseQueue();
    }
}
