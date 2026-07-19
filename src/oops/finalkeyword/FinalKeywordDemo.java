package oops.finalkeyword;

public class FinalKeywordDemo {
    public static void main(String[] args) {
        final int MAX = 100;
        // MAX = 200; Can't be changed as final variables are immutable or unchangeable
        System.out.println(MAX);

        final Student s1 = new Student("Ronaldo");
        System.out.println(s1.name);
        s1.name = "Cristiano";
        System.out.println(s1.name);

        /* s1 = new Student("Cristiano Ronaldo"); In case of final objects,
                                                  the  values can be changed, but they
                                                  cannot be reassigned i.e., the reference is immutable*/
    }
}
