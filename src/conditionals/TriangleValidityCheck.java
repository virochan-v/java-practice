package conditionals;
import java.util.Scanner;
public class TriangleValidityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a : ");
        int a = sc.nextInt();
        System.out.print("Enter side b : ");
        int b = sc.nextInt();
        System.out.print("Enter side c : ");
        int c = sc.nextInt();
        if((a+b) > c && (a+c) > b) {
            System.out.println("Valid Triangle");
        } else if((b+c) > a) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }

    }
}
