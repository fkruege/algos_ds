package ctci.Chapter1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 3/29/17.
 */
public class StringRotation1_9Test {

    @Test
    public void isRotation() throws Exception {

        StringRotation1_9 rotation = new StringRotation1_9();

        String word = "waterbottle";
        String rotated = "erbottlewat";
        Assert.assertTrue(rotation.isRotation(word, rotated));

        Assert.assertFalse(rotation.isRotation("jack", "ack"));


    }

}