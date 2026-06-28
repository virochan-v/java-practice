package bitmanipulation;

public class FastExponentiation {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        System.out.println("The result is " + fastExponentiation(base,power));
    }
    static int fastExponentiation(int base, int power) {
        int ans = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }
            power = power >> 1;
            base *= base;
        }
        return ans;
    }
}
