package patterns;

public class RightTrianglePattern {
    public static void main(String[] args) {
        rightTriangle(4);
    }
    static void rightTriangle(int n) {
        for (int row = 1;row <= n; row++) {
            for (int col = 1;col <= row;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
