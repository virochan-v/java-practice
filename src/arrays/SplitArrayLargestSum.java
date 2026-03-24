package arrays;

import java.util.Scanner;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of splits : ");
        int k = sc.nextInt();
        int res = splitArray(arr,k);
        System.out.println("The minimized largest sum of split : " + res);

    }
    static int splitArray(int[] arr,int k) {
        int start = 0;
        int end = 0;
        for (int j : arr) {
            start = Math.max(start, j);
            end += j;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            int pieces = 1;
            int sum = 0;
            for (int num : arr) {
                if (sum + num > mid) {
                    sum = num;
                    pieces ++;
                } else {
                    sum += num;
                }
            }
            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
