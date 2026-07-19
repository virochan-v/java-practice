package oops.constructoroverloading;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(17,"Pawan Kumar", "Sports", 9.76d);
        System.out.println(s1.regNo + " " + s1.name + " " + s1.dept + " " + s1.cgpa);
        Student s2 = new Student(s1);
        System.out.println(s2.name + " " + s2.cgpa);
        Student s3 = new Student();
        System.out.println(s3.name + " " + s3.dept);
    }
}
