package oops.inheritance;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Student student = new Student(
                101,
                "Bumrah",
                20,
                "Male",
                "ABC College"
        );

        student.demonstrateSuper();
    }
}
