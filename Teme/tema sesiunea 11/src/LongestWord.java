public class LongestWord {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        String sentence = "Acesta este un exemplu de fraza";
        System.out.println("Cel mai lung cuvânt: " + findLongestWord(sentence));
    }
}
