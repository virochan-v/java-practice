package strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        char[] ch = str.toCharArray();
        reverseString(ch);
        System.out.println(Arrays.toString(ch));
    }
    static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            swap(s,start,end);
            start ++;
            end --;
        }
    }
    static void swap(char[] s,int first,int second) {
        char temp = s[first];
        s[first] = s[second];
        s[second] = temp;
    }
}
