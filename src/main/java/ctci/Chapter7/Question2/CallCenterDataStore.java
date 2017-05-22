package ctci.Chapter7.Question2;

import java.util.List;

/**
 * Created by fkruege on 5/14/17.
 */
public class CallCenterDataStore {

    private EmployeeDataStore employeeDataStore;

    public CallCenterDataStore(EmployeeDataStore employeeDataStore) {
        this.employeeDataStore = employeeDataStore;
    }


    public List<CallCenterEmployee> getRespondents() {
        List<CallCenterEmployee> employees = employeeDataStore.getRespondents();
        for (CallCenterEmployee employee : employees) {
            setEmployeeBackupFor(employee);
        }
        return employees;
    }

    private void setEmployeeBackupFor(CallCenterEmployee employee) {

        CallCenterEmployee backup = employeeDataStore.getBackupEmployeeFor(employee);
        if (backup == null) {
            employee.setBackup(new VoiceMailEmployee());
        } else {
            employee.setBackup(backup);
            setEmployeeBackupFor(backup);
        }
    }


}
