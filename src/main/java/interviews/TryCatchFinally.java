package interviews;

/**
 * Created by fkruege on 2/26/17.
 */
public class TryCatchFinally {

    public static void main(String[] args) {
        int result = foo();
    }

    private static int foo() {
        try {
            // simulating an exception
            int divideOperation = 5 / 0;
            return divideOperation;

        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception " + ex.getMessage());
            return 0;
        } finally {
            System.out.println("finally");
        }
    }

}
