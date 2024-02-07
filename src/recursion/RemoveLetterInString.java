package recursion;

public class RemoveLetterInString {


    public static String removeLetter(String processed, String unprocessed, char toRemove) {
        if (unprocessed.isEmpty()) {
            return processed;
        }

        char ch = unprocessed.charAt(0);

        if (ch == toRemove) {
             return removeLetter(processed, unprocessed.substring(1), toRemove);
        } else {
            return removeLetter(processed + ch, unprocessed.substring(1), toRemove);
        }
    }

    public static void main(String[] args) {
        System.out.println(removeLetter("", "baccad", 'a'));

    }
}
