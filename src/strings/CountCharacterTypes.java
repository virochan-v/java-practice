package strings;

public class CountCharacterTypes {
    public static void main(String[] args) {
        String str = "Java@123#";
        int letters = 0;
        int digits = 0;
        int specialCharacters = 0;
        if (str.isEmpty()) {
            System.out.println("The string is empty");
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                letters += 1;
            } else if (Character.isDigit(ch)) {
                digits += 1;
            } else {
                specialCharacters += 1;
            }
        }
        System.out.println("Letters : " + letters);
        System.out.println("Numbers : " + digits);
        System.out.println("Special Characters : " + specialCharacters);

    }
}
