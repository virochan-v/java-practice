package oops.inheritance;

public class Person {
    String name;
    int age;
    String gender;

   public Person () {
        name = "";
        age = 0;
        gender = "";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void displayDetails() {
        System.out.println(name + " " + age + " " + gender);
    }

}
