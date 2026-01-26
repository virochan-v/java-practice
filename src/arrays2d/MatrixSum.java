package arrays2d;


public class MatrixSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
        };
        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }

        }
        System.out.println("Sum of elements of array : " + sum);
    }
}
