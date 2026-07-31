package oops.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.name + " " + person1.age + " " + person1.gender);
        Person person2 = new Person("Ronaldo", 41, "Male");
        person2.displayDetails();

        Student s1 = new Student();
        System.out.println(s1.regNo + " " + s1.name + " " + s1.age);

        Student s2 = new Student(17, "Pawan", 20, "Male", "ABC Engineering College");
        s2.study();
    }
}
