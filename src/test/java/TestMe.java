import sorting.ScopedObj;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fkruege on 4/8/17.
 */
public class TestMe {

    public static void main(String[] args){

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);


        List<Integer> list2 = new ArrayList<Integer>(list1);
        list2.add(2);
        list2.add(3);

        System.out.println("list1 size: " + list1.size());
        System.out.println("list2 size: " + list2.size());




    }


}
