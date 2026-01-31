package arraylist;

import java.util.ArrayList;

public class ArrayListSearchElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("C");
        list.add("C++");
        list.add("Java");
        list.add("Python");
        if(list.contains("Java")) {
            System.out.println("Java is found at index : " + list.indexOf("Java"));
        } else {
            System.out.println("Not Found");
        }

    }
}
