package arrays2d;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInFullySortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        int[] ans = search(matrix,target);
        System.out.println("The result : " + Arrays.toString(ans));

    }
    static int[] binarySearch(int[][] arr,int row,int cStart,int cEnd,int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (arr[row][mid] == target) {
                return new int[] {row,mid};
            } else if (arr[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] arr,int target) {
        int rows = arr.length;
        int cols = arr[0].length;
        if (rows == 1) {
            return binarySearch(arr,0,0,cols - 1,target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][cMid] == target) {
                return new int[] {mid,cMid};
            } else if (arr[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        if (arr[rStart][cMid] == target) {
            return new int[] {rStart,cMid};
        }
        if (arr[rStart + 1][cMid] == target) {
            return new int[] {rStart + 1,cMid};
        }

        if (cMid > 0 && target <= arr[rStart][cMid - 1]) {
            return binarySearch(arr,rStart,0,cMid - 1,target);
        } else if (cMid < cols -1 && target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]) {
            return binarySearch(arr,rStart,cMid + 1,cols - 1,target);
        } else if (cMid > 0 && target <= arr[rStart + 1][cMid - 1]) {
            return binarySearch(arr,rStart + 1,0,cMid - 1,target);
        } else if (cMid < cols - 1) {
            return binarySearch(arr,rStart + 1,cMid + 1,cols - 1,target);
        }
        return new int[] {-1,-1};

    }
}
