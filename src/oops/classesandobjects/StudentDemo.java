package oops.classesandobjects;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.regNo = 17;
        s1.name = "Pawan Kumar";
        s1.dept = "CSBS";
        s1.cgpa = 9.72d;
        System.out.println(s1.regNo + " " + s1.name + " " + s1.dept + " " + s1.cgpa);
        Student s2 = new Student();
        s2.regNo = 18;
        s2.name = "Virat Kohli";
        s2.dept = "CSE";
        s2.cgpa = 9.813d;
        System.out.println(s2.regNo + " " + s2.name + " " + s2.dept + " " + s2.cgpa);

    }
}
