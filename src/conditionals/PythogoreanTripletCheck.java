package conditionals;
import java.util.Scanner;
public class PythogoreanTripletCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean res = isTriplet(a, b, c);
        if (res) {
            System.out.println("Pythagorean Triplet");
        } else {
            System.out.println("Not Pythagorean Triplet");
        }
        sc.close();
    }
    static boolean isTriplet(int a, int b, int c) {
        if (a > b && a > c) {
            return (b * b + c * c) == a * a;
        }
        else if (b > a && b > c) {
            return (a * a + c * c) == b * b;
        }
        else {
            return (a * a + b * b) == c * c;
        }
    }
}
