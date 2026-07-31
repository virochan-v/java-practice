package oops.inheritance.privatemembers;

public class PrivateMemberAccessDemo {
    public static void main(String[] args) {
        Student student = new Student(17, "Goku", 21, "Male", "Turtle Hermit Academy", "1234-5678-2368");
        //System.out.println(student.aadharNumber);
        student.showAadhar();
    }
}
