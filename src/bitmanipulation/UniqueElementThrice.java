package bitmanipulation;

public class UniqueElementThrice {
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,2,4,4};
        System.out.println("The unique element : " + singleNumber(arr));
    }
    static int singleNumber(int[] arr) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int num : arr) {
                if ((num & (1 << i)) != 0) {
                    count++;
                }
            }
            if (count % 3 != 0) {
                result |= (1 << i);
            }
        }
        return result;
    }
}
