package bitmanipulation;

public class ResetIthBit {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;
        System.out.println("The new number : " + resetIthBit(13,2));
    }
    static int resetIthBit(int n, int i) {
        return n & ~ (1 << i);
    }
}
