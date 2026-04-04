package arrays;

public class CountGreaterThanTarget {
    public static void main(String[] args) {
        int[] arr = {3,7,1,9,5};
        int target = 4;
        int count = 0;
        for (int n : arr) {
            if (n > target) {
                count ++;
            }
        }
        System.out.println("The count of elements greater than target : " + count);
    }
}
