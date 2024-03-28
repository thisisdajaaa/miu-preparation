package queue.array_queue;

import java.util.Arrays;

public class Queue {
    private int front = 0;
    private int rear = 0;
    private int size = 0;
    private final int length;

    private int[] queue;

    public Queue(int length) {
        this.queue = new int[length];
        this.length = length;

        Arrays.fill(queue, Integer.MAX_VALUE);
    }

    public void enqueue(int data) {
        if (isFull()) return;

        queue[rear % queue.length] = data;
        rear++;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) return;

        queue[front % queue.length] = 0;
        front++;
        size--;
    }

    public int peek() {
        if (isEmpty()) return 0;

        return queue[front % queue.length];
    }

    public boolean isFull() {
        return size == length;
    }

    public boolean isEmpty() {
        return size == 0 && length == 0;
    }

    public void traverseAll() {
        for (int i = front; i < front + size; i++) {
            System.out.println(queue[i % queue.length]);
        }
    }

    public void deleteAll() {
        front = rear = size = 0;
    }
}
