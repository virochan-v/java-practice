package methodoverloading;

public class AreaOverloading {
    public static void main(String[] args) {
        System.out.println("Area : " + area(3.5d));
        System.out.println("Area : " + area(13.5d,24.2d));
        System.out.println("Area : " + area(5,4));


    }
    static double area(double radius) {
        return 3.14 * radius * radius;
    }
    static int area(int length,int breadth) {
        return length * breadth;
    }
    static double area(double base,double height) {
        return 0.5 * base * height;
    }
}
