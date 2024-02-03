package miu_againn;

public class Bunker {
    public static int isBunker(int num) {
        int currentNum = 1;
        int counter = 1;

        while(true) {
            if (currentNum > num) {
                return 0;
            }

            if (currentNum == num) {
                return 1;
            }

            currentNum = currentNum + counter;
            counter++;
        }
    }

    public static void main(String[] args) {
        System.out.println(isBunker(5));
    }
}
