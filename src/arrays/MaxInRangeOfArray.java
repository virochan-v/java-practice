package arrays;

import java.util.Scanner;

public class MaxInRangeOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();

        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Maximum in range : " + max);
    }
}
