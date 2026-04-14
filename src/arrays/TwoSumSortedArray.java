package arrays;

import java.util.Arrays;

public class TwoSumSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2,7,11,15};
        int[] arr2 = {2,3,4};
        int[] res = twoSum(arr1,9);
        int[] ans = twoSum(arr2,6);
        System.out.println("The result : " + Arrays.toString(res));
        System.out.println("The answer : " + Arrays.toString(ans));


    }
    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                return new int[] {start,end};
            } else if (sum > target) {
                end --;
            } else {
                start ++;
            }
        }
        return new int[] {-1,-1};

    }
}
