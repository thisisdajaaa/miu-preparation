package stack.practice.three_in_one;

public class Main {
    public static void main(String[] args) {
        ThreeInOne threeInOne = new ThreeInOne(3);
        threeInOne.push(0, 1);
        threeInOne.push(0, 2);
        threeInOne.push(0, 3);

        threeInOne.pop(0);
        threeInOne.pop(0);

        threeInOne.push(1, 4);
        threeInOne.push(1, 5);
        threeInOne.push(1, 6);

        threeInOne.pop(1);

        threeInOne.push(2, 7);
        threeInOne.push(2, 8);
        threeInOne.push(2, 9);

        threeInOne.pop(2);
        threeInOne.pop(2);
        threeInOne.pop(2);

        System.out.println(threeInOne.peek(0));
    }
}
