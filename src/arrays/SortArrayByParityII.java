package arrays;

import java.util.Arrays;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7};
        int[] res = sortArrayByParityII(arr);
        System.out.println("Sorted Array : " + Arrays.toString(res));

    }
    static int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        int n = nums.length;
        while(even < n && odd < n) {
            while (even < n && nums[even] % 2 == 0) {
                even += 2;
            }
            while (odd < n && nums[odd] % 2 != 0) {
                odd += 2;
            }
            if (even < n && odd < n) {
                swap(nums,even,odd);
            }
        }
        return nums;
    }
    static void swap(int[] arr,int index1,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
