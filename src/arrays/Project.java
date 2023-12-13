package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many day's temperature?");
        int numberOfDays = scanner.nextInt();
        int[] tempPerDays = new int[numberOfDays];
        Arrays.fill(tempPerDays, Integer.MIN_VALUE);

        try {
            for (int i = 1; i <= numberOfDays; i++) {
                System.out.println("Day " + i + "'s high temp:");
                int temp = scanner.nextInt();
                tempPerDays[i - 1] = temp;

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        int accumulatedTemp = 0;

        for (int tempPerDay : tempPerDays) {
            accumulatedTemp += tempPerDay;
        }


        double averageTemp = (double) accumulatedTemp / tempPerDays.length;

        int daysAboveAverage = 0;

        for (int tempPerDay : tempPerDays) {
            if (tempPerDay > averageTemp) {
                daysAboveAverage++;
            }
        }

        System.out.println(Arrays.toString(tempPerDays));
        System.out.println("Average temp is: " + averageTemp);
        System.out.println(daysAboveAverage + " days above average");
    }
}
