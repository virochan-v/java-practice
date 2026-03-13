package arrays;

import java.util.Scanner;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target to be searched : ");
        int target = sc.nextInt();
        int res = search(arr,target);
        if (res != -1) {
            System.out.println("The target is found at " + res);
        } else {
            System.out.println("The target is not found ");
        }

    }
    static int search(int[] arr,int target) {
        int pivot = findPivot(arr);
        if (pivot != -1) {
            if (target == arr[pivot]) {
                return pivot;
            } else if (target < arr[0]) {
                return binarySearch(arr,target,pivot + 1, arr.length - 1);
            } else {
                return binarySearch(arr,target,0,pivot - 1);
            }
        }
        return binarySearch(arr,target,0,arr.length - 1);
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr,int target,int start,int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
