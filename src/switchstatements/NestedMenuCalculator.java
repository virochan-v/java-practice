package switchstatements;
import java.util.Scanner;
public class NestedMenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String category = sc.nextLine();
        String op = sc.next();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // Nested Switch Statements
        switch (category) {
            case "Arithmetic":
                switch (op) {
                    case "+":
                        System.out.println("The sum is " + (num1 + num2));
                        break;
                    case "-":
                        System.out.println("The difference is " + (num1 - num2));
                        break;
                    case "*":
                        System.out.println("The result is " + (num1 * num2));
                        break;
                    case "/":
                        if (num2 != 0)
                            System.out.println("The result is " + (num1 / num2));
                        else
                            System.out.println("Cannot divide by zero");
                        break;
                    case "%":
                        if (num2 != 0)
                            System.out.println("The result is " + (num1 % num2));
                        else
                            System.out.println("Cannot divide by zero");
                        break;
                    default:
                        System.out.println("Enter valid operation");
                }
                break;
            case "Comparison":
                switch (op) {
                    case ">":
                        System.out.println("The result is " + (num1 > num2));
                        break;
                    case "<":
                        System.out.println("The result is " + (num1 < num2));
                        break;
                    case ">=":
                        System.out.println("The result is " + (num1 >= num2));
                        break;
                    case "<=":
                        System.out.println("The result is " + (num1 <= num2));
                        break;
                    case "==":
                        System.out.println("The result is " + (num1 == num2));
                        break;
                    default:
                        System.out.println("Enter valid operation");
                }
                break;
            default:
                System.out.println("Enter valid category");
        }
    }
}
