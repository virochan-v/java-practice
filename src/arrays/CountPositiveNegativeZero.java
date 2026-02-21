package arrays;

import java.util.Scanner;

public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        count(arr);

    }
    static void count(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for(int num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zeros ++;
            }
        }
        System.out.println("The count of positive numbers : " + positive);
        System.out.println("The count of negative numbers : " + negative);
        System.out.println("The count of zeros : " + zeros);

    }
}
