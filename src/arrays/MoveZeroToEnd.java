package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = moveZeros(arr);
        System.out.println("The resultant array is " + Arrays.toString(res));

    }
    static int[] moveZeros(int[] arr) {
        int pos = 0;
        for (int i = 0;i < arr.length;i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }
        return arr;
    }
}
