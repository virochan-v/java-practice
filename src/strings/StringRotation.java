package strings;

public class StringRotation {

    public static boolean isRotation(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        String combined = str1 + str1;

        return combined.contains(str2);
    }

    public static void main(String[] args) {

        String str1 = "ABCD";
        String str2 = "CDAB";

        if (isRotation(str1, str2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not Rotation");
        }
    }
}