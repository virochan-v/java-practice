package methodoverloading;

public class AdditionOverloading {
    public static void main(String[] args) {
        System.out.println("Sum : " + add(55,45));
        System.out.println("Sum : " + add(17,11,5));
        System.out.println("Sum : " + add(17.11d,45.89998d));

    }
    static int add(int a,int b) {
        return a + b;
    }
    static int add(int a,int b,int c) {
        return a + b + c;
    }
    static double add(double a,double b) {
        return a + b;
    }

}
