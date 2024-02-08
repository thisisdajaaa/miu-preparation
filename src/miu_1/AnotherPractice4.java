package miu_1;

public class AnotherPractice4 {
    public static int reverser(int n) {
        StringBuilder value = new StringBuilder();
        int number = Math.abs(n);

        while (value.length() != Integer.toString(Math.abs(n)).length()) {
            value.append(number % 10);
            number = number / 10;
        }

        return n < 0 ? -Integer.parseInt(value.toString()) : Integer.parseInt(value.toString()) ;
    }

    public static void main(String[] args) {
        System.out.println(reverser(0));
    }
}
