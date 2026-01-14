package basics;
import java.sql.SQLOutput;
import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        float si = (p*r*t)/100;
        System.out.println("The Simple Interest : "+si);
    }
}
