package bitmanipulation;

public class DigitsInBase {
    public static void main(String[] args) {
        int n = 10;
        int base = 2;
        System.out.println("The count of digits : " + digitsCount(n,base));
    }
    static int digitsCount(int n, int b) {
        return (int) (Math.log(n) / Math.log(b)) + 1;
    }
}
