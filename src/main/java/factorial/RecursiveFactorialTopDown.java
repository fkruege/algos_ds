package factorial;

/**
 * Created by fkruege on 2/17/17.
 */
public class RecursiveFactorialTopDown implements IFactorial {


    public int calculate(int n) {

        if(n == 1){
            return 1;
        }else{
           return calculate(n -1)  * n;
        }
    }
}
