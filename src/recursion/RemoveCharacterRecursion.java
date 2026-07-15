package recursion;

public class RemoveCharacterRecursion {

    public static void main(String[] args) {
        String str = "baccad";
        char remove = 'a';

        System.out.println(removeCharacter(str, remove, 0));
    }

    public static String removeCharacter(String str, char remove, int index) {
        if (index == str.length()) {
            return "";
        }

        char ch = str.charAt(index);

        if (ch == remove) {
            return removeCharacter(str, remove, index + 1);
        }

        return ch + removeCharacter(str, remove, index + 1);
    }
}