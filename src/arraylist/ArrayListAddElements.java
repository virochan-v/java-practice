package arraylist;

import java.util.ArrayList;

public class ArrayListAddElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        for(int num : list) {
            System.out.println(num);
        }
    }
}
