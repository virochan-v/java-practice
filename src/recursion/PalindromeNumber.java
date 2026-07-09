package recursion;

import java.util.Scanner;

class PalindromeNumber {

    static int reverse = 0;

    static int reverseNumber(int n) {
        if (n == 0) {
            return reverse;
        }

        reverse = reverse * 10 + (n % 10);
        return reverseNumber(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int original = num;

        reverse = 0;
        int reversed = reverseNumber(num);

        System.out.println(original == reversed);
    }
}