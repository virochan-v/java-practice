package arrays;

import java.util.Scanner;

public class EvenOddCountInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int num : arr) {
            if(num % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("The count of even numbers : " + even);
        System.out.println("The count of odd numbers : " + odd);
    }
}
