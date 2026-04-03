package arrays;

public class MaxMinDifference {
    public static void main(String[] args) {
        int[] arr = {4,2,9,1,5};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            max = Math.max(num,max);
            min = Math.min(num,min);
        }
        int diff = max - min;
        System.out.println("The difference between maximum and minimum : " + diff);
    }
}
