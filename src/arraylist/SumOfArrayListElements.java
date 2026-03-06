package arraylist;

import java.util.ArrayList;

public class SumOfArrayListElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        int sum = 0;
        for(int num : list) {
            sum += num;
        }
        System.out.println("The sum of elements of the arraylist is " + sum);
    }
}
