package interviews;

/**
 * Created by fkruege on 2/17/2017.
 */
public class ValueTest {


    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a = b;
        System.out.println("a is: " + a);

        a = 99;

        System.out.println("a is: " + a);
        System.out.println("b is: " + b);
    }
}
