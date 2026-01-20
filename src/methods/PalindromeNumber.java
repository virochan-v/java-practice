package methods;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = checkpalindrome(num);
        if (res) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }

    public static boolean checkpalindrome(int num) {
        int temp = num;
        int rev = 0;
        while(temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        if (rev == num) {
            return true;
        } else return false;
    }
}
