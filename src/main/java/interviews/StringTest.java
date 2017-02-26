package interviews;

/**
 * Created by fkruege on 2/17/2017.
 */
public class StringTest {

    public static void main(String[] args) {
        String name1 = "jack";
        String name2 = "bob";

        name1 = name2;

        System.out.println("name1 is: " + name1);

        name2 = "jill";

        System.out.println("name1 is: " + name1);
        System.out.println("name2 is: " + name2);
    }
}
