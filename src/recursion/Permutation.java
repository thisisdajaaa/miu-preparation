package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<String> getPermutations(String value) {
            List<String> permutations = new ArrayList<>();
            generatePermutationsHelper(value, "", permutations);
            return permutations;
    }

    public static void generatePermutationsHelper(String value, String current, List<String> permutations) {
        if (value.isEmpty()) {
            permutations.add(current);
            return;
        }

        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            String remaining = value.substring(0, i) + value.substring(i + 1);
            generatePermutationsHelper(remaining, current + ch, permutations);
        }
    }


    public static void main(String[] args) {
        String gg = "abc";
        System.out.println(getPermutations(gg).toString());
    }
}
