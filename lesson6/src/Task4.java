public class Task4 {
    public static void main(String[] args) {
        String sentence = "Sometimes to understand a word's meaning you need more than a definitions ";
        System.out.println(findTheLongestWord(sentence));
    }

    private static int findTheLongestWord(String sentence){
        int biggestWord = 0;
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                counter++;
            } else {
                biggestWord = Math.max(counter, biggestWord);
                counter = 0;
            }
        }
        return biggestWord;
    }
}
