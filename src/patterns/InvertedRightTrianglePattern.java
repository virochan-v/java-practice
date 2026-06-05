package patterns;

public class InvertedRightTrianglePattern {
    public static void main(String[] args) {
        invertedRightTriangle(4);
    }
    static void invertedRightTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
