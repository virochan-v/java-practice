package methods;
import java.util.Scanner;
public class LargestOfThreeUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        largest(num1,num2,num3);
    }

    private static void largest(int a,int b,int c) {
        if(a > b && a > c) {
            System.out.println(a + " is the largest");
        } else if (b > c) {
            System.out.println(b + " is the largest");
        } else {
            System.out.println(c + " is the largest");
        }
    }
}
