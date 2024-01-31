package miu_againn;

import java.util.ArrayList;
import java.util.List;

public class Inertial {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int isInertial (int[] array) {
        boolean isOddFound = false;
        int maxValue = 0;
        List<Integer> listOfOdds = new ArrayList<>();
        List<Integer> listOfEvens = new ArrayList<>();

        for (int currentValue : array) {
            if (!isEven(currentValue)) {
                isOddFound = true;
                listOfOdds.add(currentValue);
            } else {
                listOfEvens.add(currentValue);
            }

            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
        }

        boolean isOddsGreaterThanEvens = true;

        for (Integer listOfOdd : listOfOdds) {
            for (Integer listOfEven : listOfEvens) {
                if (listOfEven != maxValue) {
                    if (listOfOdd < listOfEven) {
                        isOddsGreaterThanEvens = false;
                    }
                }
            }
        }

        return isOddFound && isEven(maxValue) && isOddsGreaterThanEvens ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isInertial(new int[] {2, 12, 12, 4, 6, 8, 11}));
    }
}
