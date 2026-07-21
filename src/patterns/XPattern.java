package patterns;

public class XPattern {
    public static void main(String[] args) {
        String s = "PROGRAM";
        xPattern(s);
    }
    public static void xPattern(String s) {
        int len = s.length();
        if (s.isEmpty()) {
            return;
        }
        if (len % 2 == 0) {
            System.out.println("The length of string must be odd");
            return;
        }
        for (int row = 0; row < len; row++) {
            for (int col = 0; col < len; col++) {
                if (row == col || (row + col) == len - 1) {
                    System.out.print(s.charAt(col));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

