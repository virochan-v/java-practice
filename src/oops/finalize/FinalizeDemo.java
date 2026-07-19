package oops.finalize;

// finalize() is deprecated.
// It should not be used in modern Java.
// Garbage collection timing is not guaranteed.

public class FinalizeDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Gojo Satoru");
        Student s2 = new Student("Geto Suguru");
        Student s3 = new Student("Yuji Itadori");
        s1 = null;
        s2 = null;
        s3 = null;
        System.gc();
    }
}
