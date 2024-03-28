package stack.practice.three_in_one;

public class ThreeInOne {
    private int[] sizes;
    private int[] values;
    private final static int numOfStacks = 3;
    private int stackCapacity;

    public ThreeInOne(int stackSize) {
        this.stackCapacity = stackSize;
        values = new int[stackSize * numOfStacks];
        sizes = new int[numOfStacks];
    }

    public boolean isFull(int stackNum) {
        return sizes[stackNum] >= numOfStacks;
    }

    public boolean isEmpty(int stackNum) {
        return sizes[stackNum] == 0;
    }

    public int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    public void push(int stackNum, int value) {
        if (isFull(stackNum)) {
            System.out.println("Stack is already full");
            return;
        }

        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }

    public int pop(int stackNum) {
        if (isEmpty(stackNum)) {
            System.out.println("Stack is empty");
            return -1;
        }

        int topIndex = indexOfTop(stackNum);
        int value = values[topIndex];

        sizes[stackNum]--;
        values[topIndex] = 0;

        return value;
    }

    public int peek(int stackNum) {
        if (isEmpty(stackNum)) {
            System.out.println("Stack is empty");
            return -1;
        }

        return values[indexOfTop(stackNum)];
    }
}