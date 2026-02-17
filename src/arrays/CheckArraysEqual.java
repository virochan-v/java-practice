package arrays;

import java.util.Scanner;

public class CheckArraysEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array1 : ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Enter elements of Array1 : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of Array2 : ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.print("Enter elements of Array2 : ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean res = checkArrayEqual(arr1,arr2);
        if (res) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

    }
    static boolean checkArrayEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }

        }
        return true;
    }
}
