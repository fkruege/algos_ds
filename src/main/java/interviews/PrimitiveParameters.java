package interviews;

/**
 * Created by fkruege on 2/17/2017.
 */
public class PrimitiveParameters {

    public static void main(String[] args){
        int a = 99;
        increment(a);
        System.out.println("a is: " + a);
    }

    public static void increment(int number){
        number = number+1;
    }
}
