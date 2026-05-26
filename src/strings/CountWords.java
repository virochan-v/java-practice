package strings;

public class CountWords {

    public static int countWords(String str) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "java practice repo";

        System.out.println("Word Count: " + countWords(str));
    }
}