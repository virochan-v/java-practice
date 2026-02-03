package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());

        }
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        System.out.println("ArrayList after removing the duplicate elements : ");
        System.out.println(uniqueList);
        sc.close();

    }
}
