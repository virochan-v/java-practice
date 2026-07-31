package oops.inheritance.privatemembers;

public class Person {
    String name;
    int age;
    String gender;
    private String aadharNumber;

    public Person () {
        name = "Unknown";
        age = 0;
        gender = "Not Specified";
        aadharNumber = "N/A";
    }

    public Person(String name, int age, String gender, String aadharNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.aadharNumber = aadharNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

}
