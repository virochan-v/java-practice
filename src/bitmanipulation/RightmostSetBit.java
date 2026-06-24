package bitmanipulation;

public class RightmostSetBit {
    public static void main(String[] args) {
        int n = 13;
        System.out.println("The right most set bit : " + rightmostSetBit(n));
    }
    static int rightmostSetBit(int n) {
        return n & (-n);
    }
}
