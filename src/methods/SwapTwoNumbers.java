package methods;
import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping : "+ a + " "+ b);
        swap(a,b);
        System.out.println("In the main() : ");
        System.out.println("After calling swap method : "+ a + " " + b);
    }
    /*In Java, swapping variables inside a method does not change
    the original values because Java uses pass-by-value.
     */
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside Swap method : ");
        System.out.println("After Swapping : " + a + " " + b);
    }

}
