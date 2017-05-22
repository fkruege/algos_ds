package ctci.Chapter5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fkruege on 5/7/17.
 */
public class FractionToBinary5_2Test {
    FractionToBinary5_2 converter;

    @Before
    public void setUp() throws Exception {
        converter = new FractionToBinary5_2();
    }

    @Test
    public void getBinaryRepresentation() throws Exception {
        assertEquals(".101", converter.getBinaryRepresentation(.625));

    }

}