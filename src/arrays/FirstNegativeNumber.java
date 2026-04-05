package arrays;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        int[] arr = {5,3,-2,7,1};
        for (int num : arr) {
            if (num < 0) {
                System.out.println("The first negative number : " + num);
                break;
            }
        }
    }
}
