package arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int[] res = sortedSquares(arr);
        System.out.println("Sorted : " + Arrays.toString(res));

    }
    static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = nums.length - 1;
        for(int i = nums.length - 1;i >= 0;i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left ++;
            } else {
                result[i] = nums[right] * nums[right];
                right --;
            }
        }
        return result;

    }
}
