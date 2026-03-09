package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element to searched : ");
        int target = sc.nextInt();
        int[] res = searchRange(arr,target);
        if (res[0] != -1) {
            System.out.println("The first and last position of target is : " + Arrays.toString(res));
        } else {
            System.out.println("The element is not found");
        }

    }
    static int[] searchRange(int[] arr,int target) {
        int[] ans = {-1,-1};
        ans[0] = search(arr,target,true);
        if(ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        return ans;
    }
    static int search(int[] arr,int target,boolean firstPos) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(firstPos) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
