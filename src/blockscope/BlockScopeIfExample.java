package blockscope;


public class BlockScopeIfExample {
    public static void main(String[] args) {
        int x = 17;
        if(x > 0) {
            int y = 11;
            System.out.println("The value is : " + y);
        }
        // System.out.println(y); -> Error : y is out of scope
    }
}
