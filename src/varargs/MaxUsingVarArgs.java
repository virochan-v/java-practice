package varargs;

public class MaxUsingVarArgs {
    public static void main(String[] args) {
        System.out.println("Maximum : " + max(17,11,2005));
        System.out.println("Maximum is " + max(222,9783));
        System.out.println("Max : " + max(23,87,98,22,66));

    }
    static int max(int ...numbers) {
        int max = 0;
        if(numbers.length == 0) {
            return Integer.MIN_VALUE;
        }
        for(int num : numbers) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }
}
