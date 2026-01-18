package methods;
import java.util.Scanner;
public class CheckNumberType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checknumtype(num);
    }

    public static void checknumtype(int num) {
        if (num > 0) {
            System.out.println(num + " is a positive number");
        }
        else if (num < 0) {
            System.out.println(num + " is a negative number");
        }
        else {
            System.out.println("The number is zero");
        }
    }
}
