package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array 1 : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter elements of Array 1 : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of Array 2 : ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter elements of Array 2 : ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] merged = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];

        }
        System.out.println("The merged array is " + Arrays.toString(merged));
    }
}
