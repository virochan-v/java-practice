public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16};
        int target = 14;
        int res = findRange(arr,target);
        if (res != -1) {
            System.out.println("The target is found at " + res);
        } else {
            System.out.println("The target is not found");
        }
    }
    static int findRange(int[] arr,int target) {
        int start = 0;
        int end = 1;
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            end = Math.min(arr.length -1,end + (end - start + 1) * 2); /* Since it is not truly an infinite arrayWe use
                                                                        "min" to prevent ArrayIndexOutOfBound */
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
