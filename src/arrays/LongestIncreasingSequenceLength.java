package arrays;

import java.util.Arrays;

public class LongestIncreasingSequenceLength {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,1};
        int res = longestConsecutive(arr);
        System.out.println("Longest consecutive sequence length : " + res);

    }
    static int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;
        Arrays.sort(arr);
        int currentLength = 1;
        int maxLength = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currentLength ++;
            } else if (arr[i] == arr[i - 1]) {
                continue;
            } else {
                currentLength = 1;
            }
            maxLength = Math.max(currentLength,maxLength);
        }
        return maxLength;
    }
}
