package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayRightByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = rotateRight(arr);
        System.out.println("The resultant array is " + Arrays.toString(ans));

    }
    static int[] rotateRight(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = (arr.length - 1); i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }
}
