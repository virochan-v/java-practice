package arrays;

import java.util.Scanner;

public class FindInMountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = search(arr,target);
        if (res != -1) {
            System.out.println("The target is found at " + res);
        } else {
            System.out.println("The target is not found");
        }

    }
    static int search(int[] arr,int target) {
        int peak = peakMountainIndex(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(arr,target,peak + 1, arr.length - 1);

    }
    static int peakMountainIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr,int target,int start,int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
