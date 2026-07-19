package oops.wrapperclass;

public class WrapperClassDemo {
    public static void main(String[] args) {
        // Autoboxing
        int a = 7;
        Integer b = a;
        System.out.println("Primitive : " + a);
        System.out.println("Wrapper : " + b);
        System.out.println("Compare to 7 : " + b.compareTo(10));
        System.out.println("As double : " + b.doubleValue());
        System.out.println("To binary : " + Integer.toBinaryString(b));

        // Unboxing
        Integer c = 10;
        int d = c;
        System.out.println("Wrapper : " + c);
        System.out.println("Integer : " + d);
        System.out.println("To float : " + c.floatValue());

        System.out.println("String to Integer : " + Integer.parseInt("100"));
        System.out.println("String to Boolean : " + Boolean.parseBoolean("true"));

        System.out.println("Value of : " + Integer.valueOf("25"));

        System.out.println("Is Digit : " + Character.isDigit('5'));

        Integer number = 100;
        String str = number.toString();
        System.out.println("String : " + str);

    }
}
