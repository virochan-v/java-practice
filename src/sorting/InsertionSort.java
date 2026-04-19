package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr1 = {5,4,3,2,1};
        insertionSort(arr1);
        System.out.println("Sorted Array : " + Arrays.toString(arr1));
        int[] arr2 = {5,3,2,4,1};
        insertionSort(arr2);
        System.out.println("Sorted Array : " + Arrays.toString(arr2));
        int[] arr3 = {1,2,3,4,5};
        insertionSort(arr3);
        System.out.println("Sorted Array : " + Arrays.toString(arr3));
    }
    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr,j,j - 1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int index1,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
