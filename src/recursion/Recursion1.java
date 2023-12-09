package recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion1 {
    public static void recursiveMethod(int n) {
        if (n < 1) {
            System.out.println("N is less than 1");
        } else {
            recursiveMethod(n -1);
            System.out.println(n);
        }
    }

    public static int factorial(int n) {
        if (n < 1) return -1;
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static int fibonacci(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static int countPassengers(ArrayList<int[]> stops) {
        int totalPeople = 0;
        int totalDeparted = 0;

        for (int[] stop: stops) {
            for (int i = 0; i < stop.length; i++) {
                if (i == 0) {
                    totalPeople += stop[i];
                } else {
                    totalDeparted += stop[i];
                }
            }
        }



        return totalPeople - totalDeparted;
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;

        String[] splitted = phrase.split(" ");
        List<String> formattedWords = new ArrayList<>(){};


        for(int i = 0; i < splitted.length; i++) {
            String s = splitted[i].substring(0, 1).toUpperCase() + splitted[i].substring(1);
            formattedWords.add(s);
        }

        return String.join(" ", formattedWords).trim();
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
