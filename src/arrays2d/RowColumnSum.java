package arrays2d;

import java.util.Scanner;

public class RowColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            int rowSum = 0;
            for (int j = 0; j < col; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Sum of row " + i + " : " + rowSum);
        }
        for (int j = 0; j < col; j++) {
            int colSum = 0;
            for (int i = 0; i < row; i++) {
                colSum += arr[i][j];
            }
            System.out.println("Sum of column " + j + " : " + colSum);
        }
        sc.close();
    }
}
