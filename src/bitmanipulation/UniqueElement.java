package bitmanipulation;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,1,3};
        System.out.println("The unique element is " + isUnique(arr));
    }
    // XOR approach works only when exactly one element has an odd count
    // and all other elements occur an even number of times.
    static int isUnique(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique ^= num;
        }
        return unique;
    }
}
