package methods;
import java.util.*;
public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        isArmstrongNumbersInRange(start,end);
    }

    public static void isArmstrongNumbersInRange(int start, int end) {
        for(int num = start;num <= end;num++) {
            int original = num;
            int digits = 0;
            int sum = 0;
            int temp = num;
            if(num == 0) {
                continue;
            }
            while(temp > 0) {
                digits++;
                temp /= 10;
            }
            temp = num;
            while(temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit,digits);
                temp /= 10;
            }
            if(original == sum) {
                System.out.println(original + " is a Armstrong Number");
            }
        }
    }
}
