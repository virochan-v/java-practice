package mathematics;

public class GCD {
    public static void main(String[] args) {
        int a = 9;
        int b = 18;
        System.out.println("GCD of " + a + " and " + b + " : " + gcd(a, b));
    }
    static int gcd (int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
