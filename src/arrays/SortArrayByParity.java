package arrays;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4};
        int[] res = sortArrayByParity(arr);
        System.out.println("Array sorted by parity : " + Arrays.toString(res));

    }
    static int[] sortArrayByParity(int[] nums) {
        if(nums.length == 0) {
            return new int[] {0};
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (nums[start] % 2 == 0) {
                start ++;
            } else if (nums[end] % 2 == 1) {
                end --;
            } else {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
        }
        return nums;
    }
}
