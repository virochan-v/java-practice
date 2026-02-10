package strings;

import java.util.Scanner;

public class SearchCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.print("Enter the character to be searched : ");
        char target = sc.next().trim().charAt(0);
        boolean res = searchChar(str,target);
        if (res) {
            System.out.println("The character is found");
        } else {
            System.out.println("The character is not found");
        }

    }
    static boolean searchChar(String str,char target) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
