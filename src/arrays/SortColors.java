package arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] num = {2,0,2,1,1,0};
        sortColors(num);
        System.out.println("Sorted Colors : " + Arrays.toString(num));

    }
    static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high) {
            if (nums[mid] == 0) {
                swap(nums,mid,low);
                low ++;
                mid ++;
            } else if (nums[mid] == 1) {
                mid ++;
            } else {
                swap(nums,mid,high);
                high --;
            }
        }
    }
    static void swap(int[] arr,int index1,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
