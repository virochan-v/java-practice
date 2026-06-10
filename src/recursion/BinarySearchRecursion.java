package recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        int start = 0;
        int end = arr.length - 1;
        int res = binarySearch(arr,target,start,end);
        System.out.println("The target is at " + res);
    }
    static int binarySearch(int[] arr,int target,int start,int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr,target,start,mid - 1);
        }
        return binarySearch(arr,target,mid + 1,end);
    }
}
