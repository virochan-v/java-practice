package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array1 : ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Enter elements of Array1 : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of Array2 : ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.print("Enter elements of Array2 : ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("The common elements are : " + intersection(arr1,arr2));


    }
    static ArrayList<Integer> intersection(int[] arr1,int[] arr2) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int k : arr1) {
            for (int i : arr2) {
                if (k == i && !list.contains(k)) {
                    list.add(k);
                    break;
                }
            }
        }
        return list;

    }
}
