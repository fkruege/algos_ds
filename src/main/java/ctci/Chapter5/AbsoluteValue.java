package ctci.Chapter5;

/**
 * Created by fkruege on 5/6/17.
 */
public class AbsoluteValue {

    public int getAbs(int value) {
        int mask = value >> 31;
        return (value ^ mask) - mask;
    }


}
