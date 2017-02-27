package interviews;

/**
 * Created by fkruege on 2/26/17.
 */
public class SynchronizedKeyword {

    private int _counter = 0;

    public synchronized void increment(){
        _counter++;
    }

}
