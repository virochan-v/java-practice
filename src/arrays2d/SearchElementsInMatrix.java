package arrays2d;

import java.util.Scanner;

public class SearchElementsInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int col = sc.nextInt();
        System.out.println("Enter the elemnets of matrix : ");
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.print("Enter the element to be searched : ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j] == target) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }

        }
        if (found) {
            System.out.println(target + " is found in the matrix");
        } else {
            System.out.println(target + " is not found in the matrix");
        }

    }
}
