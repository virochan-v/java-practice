package oops.constructors;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(7,"Cristiano Ronaldo","Portugal",9.89);
        System.out.println(s1.regNo);
        System.out.println(s1.name);
        System.out.println(s1.dept);
        System.out.println(s1.cgpa);
        s1.greeting();

        System.out.println();

        Student s2 = new Student(10,"Kylian Mbappe","France",9.76);
        System.out.println(s2.regNo);
        System.out.println(s2.name);
        System.out.println(s2.dept);
        System.out.println(s2.cgpa);
        s2.greeting();

    }
}
