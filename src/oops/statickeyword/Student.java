package oops.statickeyword;

public class Student {
    int regNo;
    String name;
    String dept;
    double cgpa;
    static String collegeName;
    static int studentCount;
    Student(int regNo, String name, String dept, double cgpa) {
        this.regNo = regNo;
        this.name = name;
        this.dept = dept;
        this.cgpa = cgpa;
        Student.collegeName = "ABC Engineering College";
        Student.studentCount += 1;
    }

}
