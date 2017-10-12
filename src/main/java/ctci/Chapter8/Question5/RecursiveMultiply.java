package ctci.Chapter8.Question5;

/**
 * Created by fkruege on 5/25/17.
 */
public class RecursiveMultiply {

    public int multiply(int number, int count) {
        if (count == 0) return 0;
        else return number + multiply(number, count - 1);
    }
}
