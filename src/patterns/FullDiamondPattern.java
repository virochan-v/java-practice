package patterns;

public class FullDiamondPattern {
    public static void main(String[] args) {
        fullDiamond(5);
    }
    static void fullDiamond(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int spaces = n - totalColsInRow;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
