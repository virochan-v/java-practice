package strings;

public class LongestWord {

    public static String findLongestWord(String sentence) {

        String[] words = sentence.split(" ");
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        String sentence = "Java programming is interesting";

        System.out.println("Longest Word: "
                + findLongestWord(sentence));
    }
}