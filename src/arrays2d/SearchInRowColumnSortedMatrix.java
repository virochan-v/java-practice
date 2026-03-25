package arrays2d;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRowColumnSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        int[] res = search(arr,target);
        if (res[0] != -1) {
            System.out.println("The target is found at " + Arrays.toString(res));
        } else {
            System.out.println("The target is not found");
        }

        
    }
    static int[] search(int[][] arr,int target) {
        int row = 0;
        int col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            if (target == arr[row][col]) {
                return new int[] {row,col};
            } else if (target > arr[row][col]) {
                row ++;
            } else {
                col --;
            }
        }
        return new int[] {-1,-1};
    }
}
