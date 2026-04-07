package arrays;

public class CountDivisibleElements {
    public static void main(String[] args) {
        int[] arr1 = {10,15,20,25,30};
        int[] arr2 = {3,7,9,11};
        int res1 = countDivisible(arr1,5);
        System.out.println("The number of elements divisible by 5 : " + res1);
        int res2 = countDivisible(arr2,3);
        System.out.println("The number of elements divisible by 3 : " + res2);

    }
    static int countDivisible(int[] arr,int k) {
        if (arr.length == 0) {
            return 0;
        }
        int count = 0;
        for (int num : arr) {
            if (num % k == 0) {
                count ++;
            }
        }
        return count;
    }
}
