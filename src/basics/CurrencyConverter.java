package basics;
import java.util.*;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inr = sc.nextInt();
        float exc = 83.0f;
        float usd = inr/exc;
        System.out.println("The USD : "+"$"+usd);
    }
}
