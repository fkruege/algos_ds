package ctci.Chapter7.Question2;

import java.util.List;

public interface EmployeeDataStore {
    List<CallCenterEmployee> getRespondents();

    CallCenterEmployee getBackupEmployeeFor(CallCenterEmployee employee);


}
