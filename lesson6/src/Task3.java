import java.util.Locale;

public class Task3 {
    public static void main(String[] args) {
        String blacklist = "nlxUZ";
        System.out.println(hasNoneLetters("Hello world", blacklist));
        System.out.println(hasNoneLetters("Bye ", blacklist));
    }

    private static boolean hasNoneLetters(String phrase, String blacklist){
        phrase.toLowerCase(Locale.ROOT);
        blacklist.toLowerCase(Locale.ROOT);

        for (int i = 0; i < blacklist.length(); i++) {
            if(phrase.contains(String.valueOf(blacklist.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
