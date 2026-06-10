package recursion;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 7;
        int ans = fibonacci(n);
        System.out.println("The Fibonacci number : " + ans);
    }
    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
