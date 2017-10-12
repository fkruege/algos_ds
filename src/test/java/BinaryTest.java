import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by fkruege on 9/8/17.
 */
public class BinaryTest {

    @Test
    public void test() {
        int a = 0x01FF;
        int b = 0x80000;
        assertTrue((a & b) == 0);

//        for(int i = 0; i < Integer.MAX_VALUE; i++){
//            if(isMrefClear(i)){
//                System.out.println("i = " + i);
//            }
//
//        }


    }
    static boolean isMrefClear(int mRef) {
        return mRef == 0x80000;
//        return (mRef & 0x01FF) == 0;
    }
}
