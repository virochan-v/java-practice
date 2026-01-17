package methods;
import java.util.Scanner;
public class OddOrEvenUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res = parity(num);
        System.out.println(res);
    }

    static String parity(int val) {
        if (val % 2 == 0) {
            String n = "The number is Even";
            return n;
        } else {
            String i = "The number is Odd";
            return i;
        }
    }
}
