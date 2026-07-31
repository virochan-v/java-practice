package oops.inheritance.privatemembers;

public class Student extends Person{
    int regNo;
    String collegeName;

    public Student () {
        regNo = 0;
        collegeName = "";
    }
    public Student (int regNo, String name, int age, String gender, String collegeName, String aadharNumber) {
        super(name, age, gender, aadharNumber);
        this.regNo = regNo;
        this.collegeName = collegeName;
    }

    public void showAadhar() {
        // Cannot access private members of the parent class directly.
        // System.out.println(aadharNumber);
        System.out.println(getAadharNumber());
    }
}
