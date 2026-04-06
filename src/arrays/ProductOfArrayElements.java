package arrays;

public class ProductOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int product = 1;
        for (int num : arr) {
            product *= num;
        }
        System.out.println("The product of elements : " + product);
    }
}
