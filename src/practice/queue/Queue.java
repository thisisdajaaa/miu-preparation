package practice.queue;

public class Queue {
    int[] queue = new int[5];
    int front = 0;
    int rear = 0;

    int size = 0;

    public void enqueue(int data) {
        if (isFull()) throw new Error("Queue is full!");

        queue[rear] = data;
        size++;
        rear = (rear + 1) % queue.length;

    }

    public void dequeue() {
        if (isEmpty()) throw new Error("Queue is empty!");

        queue[front] = 0;
        size--;
        front = (front + 1) % queue.length;

    }

    public void showQueue() {
        for (int i = 0; i < size; i++) {
            System.out.println(queue[(front + i) % queue.length]);
        }
    }

    public boolean isFull() {
        return queue.length == size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
