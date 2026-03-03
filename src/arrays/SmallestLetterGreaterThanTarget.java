package arrays;

import java.util.Scanner;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().trim().charAt(0);
        }
        char target = sc.next().trim().charAt(0);
        char ch = nextGreatestLetter(arr,target);
        System.out.println("The result is " + ch);
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];

    }
}
