package arrays;

import java.util.Arrays;
import java.util.Scanner;


public class SwapElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int ind1 = sc.nextInt();
        int ind2 = sc.nextInt();
        swap(arr,ind1,ind2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
