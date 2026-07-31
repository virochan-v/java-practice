package oops.inheritance;

public class Person {
    String name;
    int age;
    String gender;

   public Person () {
        name = "Person";
        age = 0;
        gender = "N/A";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void displayDetails() {
        System.out.println(name + " " + age + " " + gender);
    }
    public void walk() {
        System.out.println(name + " is walking");
    }

}
