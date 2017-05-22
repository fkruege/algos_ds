package ctci.Chapter7.Question2;

import edu.princeton.cs.algs4.Queue;

import java.util.ArrayList;
import java.util.List;

public class CallCenter {

    private CallCenterDataStore dataStore;
    private boolean isOpen;
    Queue<CallCenterEmployee> respondentsQueue;

    List<CallCenterEmployee> busyRespondentsList;

    public CallCenter(CallCenterDataStore dataStore) {
        this.dataStore = dataStore;
        isOpen = false;
    }

    public void open() {
        isOpen = true;
        respondentsQueue = createEmployeeQueue();
        busyRespondentsList = new ArrayList<>();
    }

    public void answerCall(Call call){
        if(respondentsQueue.isEmpty()){

        }else{
            CallCenterEmployee availableEmployee = respondentsQueue.dequeue();
            availableEmployee.answerCall(call);
            busyRespondentsList.add(availableEmployee);
        }
    }

    public void close() {
        isOpen = false;
    }

    private Queue<CallCenterEmployee> createEmployeeQueue(){
        List<CallCenterEmployee> respondents =dataStore.getRespondents();
        Queue<CallCenterEmployee> employeeQueue = new Queue<>();
        for(CallCenterEmployee employee : respondents){
            employeeQueue.enqueue(employee);
        }
        return employeeQueue;
    }


}
