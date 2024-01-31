package miu_againn;

public class PorcupineNumber {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static boolean has9InLast (int n) {
        return n % 10 == 9;
    }

    public static int isPorcupineNumber(int n) {
        int currentNum = n + 1;

        while(true) {
            if (isPrime(currentNum) && has9InLast(currentNum)) {
                int anotherNum = currentNum + 1;

                while (true) {
                    if (isPrime(anotherNum)) {
                        if (has9InLast(anotherNum)) {
                            return currentNum;
                        } else {
                            break;
                        }
                    }

                    anotherNum++;
                }
            }

            currentNum++;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPorcupineNumber(0));
    }
}
