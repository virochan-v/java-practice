package loops;

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Even / Odd");
            System.out.println("2. Sum of digits");
            System.out.println("3. Reverse number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 :
                    System.out.print("Enter the number : ");
                    int num1 = sc.nextInt();
                    if(num1 % 2 == 0) {
                        System.out.println(num1 + " is Even");
                    }
                    else {
                        System.out.println(num1 + " is Odd");
                    }
                    break;
                case 2 :
                    System.out.print("Enter a number : ");
                    int num2 = sc.nextInt();
                    int sum = 0;
                    while(num2 > 0) {
                        sum += num2 % 10;
                        num2 /= 10;
                    }
                    System.out.println("Sum of digits is : " + sum);
                    break;
                case 3 :
                    System.out.print("Enter the number to be reverse : ");
                    int num3 = sc.nextInt();
                    int rev = 0;
                    while (num3 > 0) {
                        rev = rev * 10 + (num3 % 10);
                        num3 /= 10;
                    }
                    System.out.println("Reverse : " + rev);
                    break;
                case 4 :
                    System.out.println("Exiting program...");
                    break;
                default :
                    System.out.println("Enter a valid choice");
            }

        } while (choice != 4);
    }
}
