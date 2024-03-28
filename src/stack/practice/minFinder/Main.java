package stack.practice.minFinder;

public class Main {
    public static void main(String[] args) {
        StackMinimum minimum = new StackMinimum();
        minimum.push(5);
        minimum.push(2);
        minimum.push(3);
        minimum.pop();
        minimum.pop();

        System.out.println(minimum.findMinimum());
    }

}
