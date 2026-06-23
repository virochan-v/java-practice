package bitmanipulation;

public class FindIthBit {
    public static void main(String[] args) {
        int n = 13;
        int i = 3;
        System.out.println("The ith bit is " + findIthBit(n,i));
    }
    static int findIthBit(int n, int i) {
        return (n & (1 << i)) != 0 ? 1 : 0; // Use (n & (1 << i - 1)) for 1 - based indexing
    }
}
