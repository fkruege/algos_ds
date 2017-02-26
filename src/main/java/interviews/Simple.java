package interviews;

/**
 * Created by fkruege on 2/17/2017.
 */
public class Simple {

    public int X = 0;

    public Simple() {

    }

    public static void main(String[] args) {

        Simple simple1 = new Simple();

        System.out.println("Simple X: " + simple1.X);
        modifySimple(simple1);
        System.out.println("Simple X: " + simple1.X);

    }

    public static void modifySimple(Simple simple) {
        simple.X = 100;
    }
}
