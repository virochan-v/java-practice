package patterns;

public class ConcentricNumberSquare {
    public static void main(String[] args) {
        concentricNumberSquare(4);
    }
    static void concentricNumberSquare(int n) {
        int size = 2 * n - 1;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                int atEveryIndex = n - Math.min(Math.min(row,col),Math.min(size - 1 - row,size - 1 - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
