package patterns;

public class SolidSquarePattern {
    public static void main(String[] args) {
        solidSquare(5);
    }
    static void solidSquare(int n) {
        for (int i = 1;i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
