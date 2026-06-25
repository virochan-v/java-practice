package bitmanipulation;

public class NthMagicNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("The " + n + "th" + " magic number is " + magicNumber(n));
    }
    static int magicNumber(int n) {
        int result = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            result += last * base;
            base = base * 5;
        }
        return result;
    }
}
