package varargs;


public class SumUsingVarArgs {
    public static void main(String[] args) {
        System.out.println("The sum is " + sum(5,7,8));
        System.out.println("The sum is " + sum(1,9,2,34,6));

    }
    static int sum(int ...numbers) {
        int total = 0;
        for(int num : numbers) {
            total += num;
        }
        return total;

    }
}
