package conditionals;

import java.util.Scanner;

public class RepeatedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter operator (+, -, *, /, %, X to exit): ");
            char op = sc.next().trim().charAt(0);

            if (op == 'X' || op == 'x') {
                System.out.println("The calculations are stopped");
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter first number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();

                int ans;

                if (op == '+') {
                    ans = num1 + num2;
                    System.out.println("The result is " + ans);
                } else if (op == '-') {
                    ans = num1 - num2;
                    System.out.println("The result is " + ans);
                } else if (op == '*') {
                    ans = num1 * num2;
                    System.out.println("The result is " + ans);
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                        System.out.println("The result is " + ans);
                    } else {
                        System.out.println("Division by zero is not allowed");
                    }
                } else {
                    if (num2 != 0) {
                        ans = num1 % num2;
                        System.out.println("The result is " + ans);
                    } else {
                        System.out.println("Modulo by zero is not allowed");
                    }
                }
            } else {
                System.out.println("Enter a valid operation");
            }
        }

        sc.close();
    }
}
