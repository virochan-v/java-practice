package arraylist;

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        ArrayList<Integer> res = reverse(list);
        System.out.println("The Reversed ArrayList : " + res);
    }
    static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
        return list;
    }
}
