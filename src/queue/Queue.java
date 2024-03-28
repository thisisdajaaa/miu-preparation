package queue;

public class Queue {
    private int[] queue = new int[5];
    private int size = 0;
    private int front = 0;
    private int rear = 0;

    public void enqueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            size++;
            rear = (rear + 1) % queue.length;
            return;
        }

        System.out.println("Queue is full");

    }

    public int dequeue() {
        if (!isEmpty()) {
            int data = queue[front];
            front = (front + 1) % queue.length;
            size--;
            return data;
        }

        System.out.println("Queue is empty");
        return 0;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(queue[(front + i) % queue.length]);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public int size() {
        return size;
    }
}
