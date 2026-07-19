package oops.finalize;

public class Student {
    String name;
    Student(String name) {
        this.name = name;
        System.out.println("Student object created: " + name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize called for: " + name);
        super.finalize();
    }
}
