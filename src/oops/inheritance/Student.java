package oops.inheritance;

public class Student extends Person {
    int regNo;
    String collegeName;

    public Student () {
        regNo = 0;
        collegeName = "";
    }
    public Student (int regNo, String name, int age, String gender, String collegeName) {
        super(name, age, gender);
        this.regNo = regNo;
        this.collegeName = collegeName;
    }
    public void study() {
        System.out.println(name + " is studying in " + collegeName);
    }
}
