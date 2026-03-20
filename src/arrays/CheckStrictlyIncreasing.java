package arrays;

import java.util.Scanner;

public class CheckStrictlyIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = checkStrictlyIncreasing(arr);
        if (ans) {
            System.out.println("Array is strictly increasing");
        } else {
            System.out.println("Array is not strictly increasing");
        }
    }
    static boolean checkStrictlyIncreasing(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
