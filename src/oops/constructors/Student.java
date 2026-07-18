package oops.constructors;

public class Student {
    int regNo;
    String name;
    String dept;
    double cgpa;
    Student(int regNo, String name, String dept, double cgpa) {
        this.regNo = regNo;
        this.name = name;
        this.dept = dept;
        this.cgpa = cgpa;
    }
    void greeting() {
        System.out.println("I am " + this.name);
    }
}
