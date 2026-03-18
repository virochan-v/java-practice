package arrays;

import java.util.Scanner;

public class SearchInRotatedSortedArrayWithDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target : ");
        int target = sc.nextInt();
        boolean res = search(arr,target);
        if(res) {
            System.out.println("The target is found");
        } else {
            System.out.println("The target is not found");
        }
    }
    static boolean search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        if (pivot != -1) {
            if(target == nums[pivot]) {
                return true;
            } else if (target >= nums[0]) {
                return binarySearch(nums,target,0,pivot);
            } else {
                return binarySearch(nums,target,pivot + 1,nums.length - 1);
            }
        }
        return binarySearch(nums,target,0,nums.length - 1);
    }
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if(start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start ++;
                if(end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end --;
            } else if (arr[start] < arr[mid] || (arr[mid] == arr[start] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    static boolean binarySearch(int[] arr,int target,int start,int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
