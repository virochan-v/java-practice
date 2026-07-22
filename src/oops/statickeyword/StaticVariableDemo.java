package oops.statickeyword;

public class StaticVariableDemo {
    public static void main(String[] args) {
        Student s1 = new Student(7, "Ronaldo", "Sports", 9.87);
        Student s2 = new Student(19, "Haaland", "Sports", 9.61);
        Student s3 = new Student(13, "Harvey Specter", "Law", 9.88);

        System.out.println(s1.name + " " + Student.collegeName + " " + Student.studentCount);
        System.out.println(s2.name + " " + Student.collegeName + " " + Student.studentCount);
        System.out.println(s3.name + " " + Student.collegeName + " " + Student.studentCount);
    }
}
