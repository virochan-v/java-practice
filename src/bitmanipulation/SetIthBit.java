package bitmanipulation;

public class SetIthBit {
    public static void main(String[] args) {
        int n = 13;
        int i = 1;
        System.out.println("The number : " + setIthBit(n,i));
    }
    static int setIthBit(int n, int i) {
        return n | (1 << i); // Use n | (1 << (i - 1)) for 1 - based indexing
    }
}
