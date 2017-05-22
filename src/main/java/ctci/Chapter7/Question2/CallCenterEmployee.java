package ctci.Chapter7.Question2;

/**
 * Created by fkruege on 5/14/17.
 */
public interface CallCenterEmployee {
    CallCenterEmployee getBackup();

    boolean isBusy();
    boolean isBackupAvailable();
    boolean isHuman();

    void answerCall(Call call);

    void setBackup(CallCenterEmployee employee);
}
