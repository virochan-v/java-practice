package arrays;

public class IndexOfMaxElement {
    public static void main(String[] args) {
        int[] arr1 = {3,9,5,7};
        int res = maxIndex(arr1);
        System.out.println("The index of max element : " + res);
        int[] arr2 = {6,9,19,12};
        int ans = maxIndex(arr2);
        System.out.println("The max element index : " + ans);

    }
    static int maxIndex(int[] arr) {
        int maxInd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxInd]) {
                maxInd = i;
            }
        }
        return maxInd;
    }
}
