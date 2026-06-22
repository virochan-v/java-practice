package bitmanipulation;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 7;
        if (isOdd(n)) {
            System.out.println("The number is Odd");
        } else {
            System.out.println("The number is Even");
        }
    }
    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
