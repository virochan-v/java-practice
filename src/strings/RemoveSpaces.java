package strings;

public class RemoveSpaces {

    public static String removeSpaces(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String str = "java practice repo";

        System.out.println(removeSpaces(str));
    }
}