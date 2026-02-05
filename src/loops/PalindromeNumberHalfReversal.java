package loops;

import java.util.Scanner;

public class PalindromeNumberHalfReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        boolean res = isPalindrome(num);
        if(res) {
            System.out.println(num + " is a Palindrome number");
        } else {
            System.out.println(num + " is not a Palindrome number");
        }

    }

    public static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0) && x != 0) {
            return false;
        }
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }
}
