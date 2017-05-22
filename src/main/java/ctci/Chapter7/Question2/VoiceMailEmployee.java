package ctci.Chapter7.Question2;

/**
 * Created by fkruege on 5/14/17.
 */
public class VoiceMailEmployee implements CallCenterEmployee {

    @Override
    public CallCenterEmployee getBackup() {
        return this;
    }

    @Override
    public boolean isBusy() {
        return false;
    }

    @Override
    public boolean isBackupAvailable() {
        return false;
    }

    @Override
    public boolean isHuman() {
        return false;
    }

    @Override
    public void answerCall(Call call) {
        System.out.println("Voicemail");

    }

    @Override
    public void setBackup(CallCenterEmployee employee) {

    }
}
