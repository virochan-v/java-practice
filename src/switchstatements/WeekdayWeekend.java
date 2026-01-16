package switchstatements;
import java.util.Scanner;
public class WeekdayWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        // Enhanced Switch Statement
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println(day + " is a Weekday");
            case "Saturday", "Sunday" -> System.out.println(day + " is a Weekend");
            default -> System.out.println("Enter a valid day");
        }
    }
}
