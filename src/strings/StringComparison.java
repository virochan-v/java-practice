package strings;

public class StringComparison {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        // new String is used to make the javac create the String outside String pool
        String c = new String("hello");

        // Compares memory reference (address)
        System.out.println("a == b : " + (a == b));
        System.out.println("a == c : " + (a == c));
        // Compares actual string content
        System.out.println("a.equals(c) : " + a.equals(c));
    }
}
