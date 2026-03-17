package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayLeftByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = rotateLeft(arr);
        System.out.println("The array after left rotation by one : " + Arrays.toString(res));
    }
    static int[] rotateLeft(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }
}
