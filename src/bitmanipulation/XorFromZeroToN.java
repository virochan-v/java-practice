package bitmanipulation;

public class XorFromZeroToN {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("The XOR from 0 to n : " + xorFromZeroToN(n));
    }
    static int xorFromZeroToN(int n) {
        if (n % 4 == 0) {
            return n;
        } else if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        } else {
            return 0;
        }
    }
}
