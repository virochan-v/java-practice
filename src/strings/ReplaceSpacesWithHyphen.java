package strings;

public class ReplaceSpacesWithHyphen {

    public static String replaceSpaces(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                result.append('-');
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "java practice repo";

        System.out.println(replaceSpaces(str));
    }
}