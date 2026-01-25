package arrays;

import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        System.out.println("Maximum value : " + max);
        System.out.println("Minimum value : " + min);
    }
}
