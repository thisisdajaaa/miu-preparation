package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subseq {
    static List<String> getSubseq(String value) {
        List<String> list = new ArrayList<>();
        getSubseqWithAsciiHelper("", value, list);
        return list;
    }


    static void getSubseqHelper(String processed, String unprocessed, List<String> subseqs) {
        if (unprocessed.isEmpty()) {
            if (!processed.isEmpty()) subseqs.add(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        getSubseqHelper(processed + ch, unprocessed.substring(1), subseqs);
        getSubseqHelper(processed, unprocessed.substring(1), subseqs);
    }

    static void getSubseqWithAsciiHelper(String processed, String unprocessed, List<String> subseqs) {
        if (unprocessed.isEmpty()) {
            subseqs.add(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        getSubseqWithAsciiHelper(processed + ch, unprocessed.substring(1), subseqs);
        getSubseqWithAsciiHelper(processed, unprocessed.substring(1), subseqs);
        getSubseqWithAsciiHelper(processed + (ch + 0), unprocessed.substring(1), subseqs);
    }

    public static void main(String[] args) {
        System.out.println('a' + 0);
        System.out.println(getSubseq("abc").toString());
    }
}
