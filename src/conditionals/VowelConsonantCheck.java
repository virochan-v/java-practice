package conditionals;
import java.util.Scanner;
public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if(ch == 'a'||ch == 'e'|| ch == 'i'||ch == 'o'||ch =='u'||ch == 'A'||ch == 'E'
        ||ch == 'I'||ch == 'O'||ch == 'U') {
            System.out.println("The character " + ch +" is a Vowel");
        } else {
            System.out.println("The character " + ch +" is a Consonant");
        }
    }
}
