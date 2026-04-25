package basics;

public class PrettyPrinting {
    public static void main(String[] args) {
        String name = "John";
        int age = 20;
        double marks = 95.6789;

        System.out.printf("Name : %s\n",name);
        System.out.printf("Age : %d\n",age);
        System.out.printf("Marks : %.2f\n",marks);
        System.out.printf("Pie : %.3f\n",Math.PI);
    }
}
