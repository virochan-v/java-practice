package loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        if (num == 0) {
            count = 1;
        }
        while (num > 0) {
            count ++;
            num /= 10;
        }
        System.out.println("The count of digits : " + count);
    }
}
