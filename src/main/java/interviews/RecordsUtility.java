package interviews;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fkruege on 2/17/2017.
 */
public class RecordsUtility {

    public static List<String> getNames() {

        List<String> names = new ArrayList<String>();
        names.add("Jack");
        names.add("Jill");
        names.add("Bob");

        return names;
    }

    public static void main(String args) {
        List<String> names = getNames();
        for (String name :
                names) {
            System.out.println(name);

        }

    }
}
