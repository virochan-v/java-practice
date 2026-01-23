package conditionals;
import java.util.Scanner;
public class GradeCalculatorUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects : ");
        int count = sc.nextInt();
        int totalMarks = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter marks of subject " + (i+1) + " : ");
            totalMarks += sc.nextInt();
        }
        int percentage = totalMarks / count;
        gradeCheck(percentage);

    }

    static void gradeCheck(int score) {
        if(score >= 91) {
            System.out.println("Grade : A+");
        }
        else if(score >= 81) {
            System.out.println("Grade : A");
        }
        else if(score >= 71) {
            System.out.println("Grade : B");
        }
        else if(score >= 50) {
            System.out.println("Grade : C");
        }
        else {
            System.out.println("Fail");
        }

    }
}
