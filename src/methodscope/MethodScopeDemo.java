package methodscope;
public class MethodScopeDemo {
    public static void main(String[] args) {
        methodOne();
        methodTwo();
        /* Since the values initialized inside the method
        exists only inside that method it allows us use
        the same variable or object name in different methods
         */
    }

    public static void methodTwo() {
        int num = 20; // num exists only inside this method
        System.out.println(num);
    }

    public static void methodOne() {
        int num = 10; // num exists only inside this method
        System.out.println(num);
    }
}
