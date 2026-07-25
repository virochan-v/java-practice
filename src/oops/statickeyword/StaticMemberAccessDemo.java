package oops.statickeyword;

public class StaticMemberAccessDemo {
    public static void main(String[] args) {
        Student s1 = new Student(17, "Pawan Kumar", "Sports", 9.89);
        s1.displayStudent();

        Student.displayCollege();

        Student.test();

        Student.displayCollege();

        s1.check();
    }
}
