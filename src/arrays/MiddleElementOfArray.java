package arrays;

import java.util.Scanner;

public class MiddleElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int size = arr.length;
        if (size % 2 == 1) {
            System.out.println("Middle element : " + arr[n / 2]);
        } else {
            System.out.println("Middle elements : " + arr[(n / 2) - 1] + " and " +arr[n / 2]);
        }
    }
}
