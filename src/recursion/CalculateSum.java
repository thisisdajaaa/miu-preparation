package recursion;

public class CalculateSum {
    public static int getSum(int start, int end) {
        if (end == start) return start;

        return end + getSum(start, end - 1);
    }

    public static void main(String[] args) {
        System.out.println(getSum(1, 3));
    }
}
