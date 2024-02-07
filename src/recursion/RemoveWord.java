package recursion;

public class RemoveWord {
    public static String removeWord(String processed, String unprocessed, String word) {
        if (unprocessed.isEmpty()) {
            return processed;
        }

        if (unprocessed.startsWith(word)) {
            return removeWord(processed, unprocessed.substring(word.length()), word);
        } else {
            return removeWord(processed + unprocessed.charAt(0), unprocessed.substring(1), word);
        }

    }

    public static void main(String[] args) {
        System.out.println(removeWord("", "Theapple", "app"));
    }
}
