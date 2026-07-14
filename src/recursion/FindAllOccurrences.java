package recursion;

import java.util.ArrayList;

public class FindAllOccurrences {

    public static ArrayList<Integer> findOccurrences(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        find(arr, target, 0, result);
        return result;
    }

    private static void find(int[] arr, int target, int index, ArrayList<Integer> result) {
        // Base case
        if (index == arr.length) {
            return;
        }

        // If target is found, store the index
        if (arr[index] == target) {
            result.add(index);
        }

        // Recursive call
        find(arr, target, index + 1, result);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 5, 8, 5};
        int target = 5;

        System.out.println(findOccurrences(arr, target));
    }
}