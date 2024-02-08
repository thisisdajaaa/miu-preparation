package miu_1;

public class MinDistance {
    public static int getMinDistance(int n) {
        int min = n;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (n % j == 0) {
                        if (min > j - i) {
                            min = j - i;
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(getMinDistance(13013));
    }
}
