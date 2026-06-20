package recursion;

public class CountZeroesRecursion {

    static int countZeroes(int n) {

        if (n == 0) {
            return 0;
        }

        int count = (n % 10 == 0) ? 1 : 0;

        return count + countZeroes(n / 10);
    }

    public static void main(String[] args) {

        int n = 30204005;

        System.out.println(countZeroes(n));
    }
}