package patterns;

public class NumberTrianglePattern {
    public static void main(String[] args) {
        numberTriangle(4);
    }
    static void numberTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
