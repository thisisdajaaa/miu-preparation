package miu_1;

public class KSmallFactors {
    public static int hasKSmallFactors(int k, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i * j  == n && k > i && k > j) {
                    return 1;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(hasKSmallFactors(6, 30));
    }
}
