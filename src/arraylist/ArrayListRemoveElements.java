package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRemoveElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Enter index to be removed : ");
        int index = sc.nextInt();
        System.out.print("Enter the object to be removed : ");
        int obj = sc.nextInt();
        list.remove(index);
        list.remove(Integer.valueOf(obj));
        System.out.println(list);

    }
}
