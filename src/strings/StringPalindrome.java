package strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean res = isPalindrome(str);
        if (res) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }
    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
