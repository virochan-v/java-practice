package arrays;

import java.util.Scanner;

public class ArrayPalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = isPalindrome(arr);
        if (ans) {
            System.out.println("The array is a palindrome array");
        } else {
            System.out.println("The array is not a palindrome array");
        }
    }
    static boolean isPalindrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}
