package oops.constructoroverloading;

public class Student {
    int regNo;
    String name;
    String dept;
    double cgpa;
    Student() {
        this(0,"Student", "default", 0.0);
    }
    Student(Student other) {
        this.regNo = other.regNo;
        this.name = other.name;
        this.dept = other.dept;
        this.cgpa = other.cgpa;
    }
    Student(int regNo, String name, String dept, double cgpa) {
        this.regNo = regNo;
        this.name = name;
        this.dept = dept;
        this.cgpa = cgpa;
    }
}
