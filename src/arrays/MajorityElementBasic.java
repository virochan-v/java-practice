package arrays;

import java.util.Scanner;

public class MajorityElementBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res = majorityElement(arr);
        if (res != -1) {
            System.out.println("The majority element is " + res);
        } else {
            System.out.println("There exists none");
        }

    }
    static int majorityElement(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > (arr.length / 2)) {
                return arr[i];
            }
        }
        return -1;
    }
}
