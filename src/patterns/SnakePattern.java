package patterns;

public class SnakePattern {
    public static void main(String[] args) {
        int n = 4;
        snakePattern(n);
    }
    public static void snakePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    int value = (i * n) + j + 1;
                    System.out.print(value + "\t");
                } else {
                    int value = (i * n) + (n - j);
                    System.out.print(value + "\t");
                }
            }
            System.out.println();
        }
    }
}
