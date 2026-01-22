package methods;
import java.util.Scanner;
// Program to check whether a number is prime using a method
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        if (ans) {
            System.out.println(n + " is a prime number");
        }
        else {
            System.out.println(n + " is a not prime number");
        }
    }

    public static boolean isPrime(int n) {
        int c = 2;
        if(n <= 1) {
            return false;
        }
        while(c * c <= n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
