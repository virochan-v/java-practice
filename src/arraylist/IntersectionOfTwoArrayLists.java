package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfTwoArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        int m = sc.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list2.add(sc.nextInt());
        }
        ArrayList<Integer> res = intersectionArrayLists(list1,list2);
        System.out.println("Intersection : " + res);

    }

    static ArrayList<Integer> intersectionArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> current = new ArrayList<>();
        for (int k : list1) {
            for (int i : list2) {
                if (k == i && !current.contains(k)) {
                    current.add(k);
                }
            }
        }
        return current;
    }
}
