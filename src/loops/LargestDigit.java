package loops;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = Integer.MIN_VALUE;
        while (num > 0) {
            int rem = num % 10;
            max = Math.max(max,rem);
            num /= 10;
        }
        System.out.println("The largest digit is " + max);
    }
}
