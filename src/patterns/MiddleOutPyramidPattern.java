package patterns;

public class MiddleOutPyramidPattern {
    public static void main(String[] args) {
        String s = "PROGRAM";
        middleOutPyramid(s);
    }
    public static void middleOutPyramid(String s) {
        int len = s.length();
        int mid = (len % 2 == 0) ? (len - 1) / 2 : len / 2;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                int charIndex = (mid + k) % len;
                System.out.print(s.charAt(charIndex));
            }
            System.out.println();
        }
    }
}

