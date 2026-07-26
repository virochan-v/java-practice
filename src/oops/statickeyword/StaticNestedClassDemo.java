package oops.statickeyword;

public class StaticNestedClassDemo {
    public static void main(String[] args) {
        Student.College college = new Student.College("Dr.Sharma");
        college.displayPrincipal();
        System.out.println();
        Student s1 = new Student(1, "Yagami", "Science", 9.78);
        s1.displayStudent();
    }
}
