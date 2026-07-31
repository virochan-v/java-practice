package oops.inheritance;

public class ReferenceTypeDemo {
    public static void main(String[] args) {
        Person person = new Student(11, "Neymar", 21, "Male", "Santos Academy");
        person.displayDetails();
        // person.study(); Reference type decides the members which can be accessed

        // Student student = new Person(); Child class cannot be used since Parent do not know about values to be initialized


    }
}
