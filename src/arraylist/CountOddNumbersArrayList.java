package arraylist;

import java.util.ArrayList;

public class CountOddNumbersArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(22);
        list.add(33);
        list.add(40);
        int ans = countOddNumbers(list);
        System.out.println("The count of odd numbers in the list : " + ans);
    }
    static int countOddNumbers(ArrayList<Integer> list) {
        int count = 0;
        for (int num : list) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
