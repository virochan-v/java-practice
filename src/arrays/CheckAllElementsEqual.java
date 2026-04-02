package arrays;

public class CheckAllElementsEqual {
    public static void main(String[] args) {
        int[] arr = {5,5,5,5,5};
        boolean allEqual = true;
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) {
            System.out.println("All elements are equal");
        } else {
            System.out.println("Not all elements are equal");
        }
    }
}
