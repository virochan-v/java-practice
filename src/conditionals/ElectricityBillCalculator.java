package conditionals;
import java.util.Scanner;
public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of units consumed : ");
        int units = sc.nextInt();
        double bill;
        if(units <= 100) {
            bill = units * 5;
            System.out.println("The electricity bill is " + "Rs." + bill);
        } else if (units <= 200) {
            bill = (100 * 5) + (units - 100) * 7;
            System.out.println("The electricity bill is "+ "Rs." + bill);
        } else {
            bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
            System.out.println("The electricity bill is " + "Rs." + bill);
        }

    }
}
