package methods;
import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean check = eligibity(age);
        if (check) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
        sc.close();
    }
    static boolean eligibity(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
