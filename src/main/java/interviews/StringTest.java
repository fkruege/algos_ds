package interviews;

/**
 * Created by fkruege on 2/17/2017.
 */
public class StringTest {

    public static void main(String[] args) {
        String name1 = "Jack";
        String name2 = "Bob";

        name1 = name2;
        name2 = "Jill";

        System.out.println("name1 is: " + name1);
        System.out.println("name2 is: " + name2);
    }


}
