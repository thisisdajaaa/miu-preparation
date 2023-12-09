package test;

import javax.xml.stream.events.Characters;
import java.util.*;

public class Test {
    public static long nextBiggerNumber(long n)
    {
        List<String> numberList= new ArrayList<>();
        Set<String> numberSet = new HashSet<>();
        String nToString = Long.toString(n);

        for(Character c: nToString.toCharArray()) {
            numberList.add(c.toString());
            numberSet.add(c.toString());
        }

        if (Long.toString(n).length() == 1 || numberSet.size() == 1) return -1;

        long shuffledNumber = 0;

        while (n > shuffledNumber) {
            Collections.shuffle(numberList);
            String joinedNumber =  String.join("", numberList.toArray(new String[0]));
            shuffledNumber =  Long.parseLong(joinedNumber);
        }

        return shuffledNumber;

    }
    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(2017));
    }
}
