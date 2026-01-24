package shadowing;

public class ShadowingMethod {
    static int x = 17; // class variable
    public static void main(String[] args) {
        System.out.println(x); // 17
        int x = 11;
        System.out.println(x); // 11 Local variable shadows the class variable
        shadow();
    }

    static void shadow() {
        System.out.println(x); // 17 Outside main()
    }
}
