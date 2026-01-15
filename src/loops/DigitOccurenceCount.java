package loops;
import java.util.Scanner;
public class DigitOccurenceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            if (rem == d) {
                count++;
            }
        }
        System.out.println("Count of Occurence of a digit : "+count);
    }
}
