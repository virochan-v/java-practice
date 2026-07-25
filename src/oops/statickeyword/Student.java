package oops.statickeyword;

public class Student {
    int regNo;
    String name;
    String dept;
    double cgpa;
    static String collegeName = "ABC Engineering College";
    static int studentCount;
    static int placementPercentage;
    static {
        System.out.println("Static block is executed");
        placementPercentage = 90;
        System.out.println("Placement Percentage : " + placementPercentage);
    }
    Student(int regNo, String name, String dept, double cgpa) {
        this.regNo = regNo;
        this.name = name;
        this.dept = dept;
        this.cgpa = cgpa;
        Student.studentCount += 1;
    }
    void displayStudent() {
        System.out.println(this.name + " " + this.dept + " " + this.cgpa);
    }
    static void displayCollege() {
        // this.collegeName results in error
        // this keyword cannot be used on static variables as they do not depend on the object
        System.out.println(collegeName + " " + studentCount);
    }

    static void test() {
        // Non-static methods requires the instance to be specified
        // Static methods are independent of object but non-static methods are dependent

        // To call a non-static method inside static method we need to specify instance/objcet
        // In other words, create an object and use it call the non-static method

        Student student = new Student(18, "Virat Kohli", "Sports", 9.89);
        student.displayStudent();
    }
    void check() {
        // We can static-methods inside a non-static method as non-static methods do not restrict
        displayCollege();
    }

}
