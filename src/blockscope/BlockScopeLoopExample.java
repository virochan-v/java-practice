package blockscope;

public class BlockScopeLoopExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //System.out.println(i); -> i is not accessible here
    }
}
