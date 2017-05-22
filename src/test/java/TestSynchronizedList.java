import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;

/**
 * Created by fkruege on 4/4/17.
 */
public class TestSynchronizedList {

    private static class TestObj {
        String text = "";
    }

    @Test
    public void synchroTest() {

        TestObj obj1 = new TestObj();
        obj1.text = "Hello";

        List<TestObj> list1 = new ArrayList<TestObj>();
        list1.add(obj1);


        List<TestObj> synchroList = Collections.synchronizedList(list1);
        assertEquals(list1.size(), synchroList.size());


        TestObj obj2 = new TestObj();
        obj2.text = "Hello";

        list1.add(obj2);

        assertEquals(list1.size(), synchroList.size());

        TestObj obj3 = new TestObj();
        obj3.text = "Hello";
        synchroList.add(obj3);

        assertEquals(list1.size(), synchroList.size());

        list1.get(0).text = "blue";

        assertEquals(list1.get(0).text, synchroList.get(0).text);

    }


}
