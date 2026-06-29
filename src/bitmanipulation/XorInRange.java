package bitmanipulation;

public class XorInRange {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.println("The XOR of numbers between " + a + " and " + b + " : " + xorInRange(a, b));
    }
    static int xorInRange(int a, int b) {
        return xorFromZeroToN(b) ^ xorFromZeroToN(a - 1);
    }
    static int xorFromZeroToN(int n) {
        if (n % 4 == 0) {
            return n;
        } else if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        } else {
            return n;
        }
    }
}