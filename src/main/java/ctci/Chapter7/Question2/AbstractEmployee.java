package ctci.Chapter7.Question2;

/**
 * Created by fkruege on 5/14/17.
 */
public abstract class AbstractEmployee implements Employee {

    private int employeeId;

    public AbstractEmployee(int employeeId) {
        this.employeeId = employeeId;
    }

    public int id() {
        return employeeId;
    }


    public void doWork() {
        System.out.println("working");
    }


}
