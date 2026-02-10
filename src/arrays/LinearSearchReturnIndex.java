package arrays;

import java.util.Scanner;

public class LinearSearchReturnIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target to be searched : ");
        int target = sc.nextInt();
        int ans = linearSearch(nums,target);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (target == element) {
                return index;
            }
        }
        return -1;
    }
}
