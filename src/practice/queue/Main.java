package practice.queue;

public class Main {
    public static void main(String[] args) {
//        Queue queue = new Queue();
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//
//        queue.dequeue();
//
//        queue.enqueue(4);
//        queue.enqueue(5);
//        queue.enqueue(6);
//
//        queue.dequeue();
//
//        queue.showQueue();
        System.out.println(reverseNumber(123));
    }

    public static int reverseNumber(int value) {
        return reverseNumberHelper(0, value);
    }

    public static int reverseNumberHelper(int processed, int unprocessed) {
        if (unprocessed == 0) {
            return processed;
        }

        int temp = unprocessed % 10;
        int answer = processed * 10 + temp;
        return reverseNumberHelper(answer, unprocessed / 10);
    }
}
