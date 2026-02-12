package arrays;

import java.util.Scanner;

public class EvenDigitNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findNumbers(arr);
        System.out.println("The count of numbers with even digit is : " + ans);


    }
    static int findNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {
        int count = 0;
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            count = 1;
        }
        while (num > 0) {
            count ++;
            num /= 10;
        }
        return count % 2 == 0;
    }
}
