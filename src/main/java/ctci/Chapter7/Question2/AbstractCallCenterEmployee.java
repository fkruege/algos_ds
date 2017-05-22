package ctci.Chapter7.Question2;

/**
 * Created by fkruege on 5/14/17.
 */
public abstract class AbstractCallCenterEmployee implements CallCenterEmployee {

    private CallCenterEmployee backup;
    private boolean isBusy;


    @Override
    public CallCenterEmployee getBackup() {
        return backup;
    }

    @Override
    public void setBackup(CallCenterEmployee employee) {
        backup = employee;
    }

    @Override
    public boolean isBusy() {
        return isBusy;
    }


    @Override
    public boolean isBackupAvailable(){
        if(!backup.isHuman()){
            return false;
        }

        if(!backup.isBusy()){
            return true;
        }

        return backup.isBackupAvailable();
    }

    @Override
    public void answerCall(Call call) {
        if (!isBusy) {
            handleCall(call);
        } else {
            backup.answerCall(call);
        }
    }

    public abstract void handleCall(Call call);

}
