package methodscope;

public class MethodScopeExample {
    public static void main(String[] args) {
        showNumber();
        /* The following line causes a compile-time error
        because num is not visible outside the showNumber method
         */
        // System.out.println(num);
    }

    public static void showNumber() {
        int num = 17; // num exists only inside this method
        System.out.println(num);
    }
}
