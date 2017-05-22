//package ctci.Chapter7.Question2;
//
///**
// * Created by fkruege on 5/14/17.
// */
//public class Respondent implements Employee, CallCenterEmployee {
//
//
//    private class EmployeeImpl extends AbstractEmployee {
//        EmployeeImpl(int employeeId) {
//            super(employeeId);
//        }
//
//        @Override
//        public void doWork() {
//            System.out.println("Do Respondent work");
//        }
//    }
//
//    private class CallCenterEmployeeImpl extends AbstractCallCenterEmployee {
//        @Override
//        public void handleCall(Call call) {
//            System.out.println("Hello, I'm the respondent.");
//        }
//    }
//
//
//    EmployeeImpl employee;
//    CallCenterEmployeeImpl callCenterEmployee;
//
//    public Respondent(int employeeId) {
//        employee = new EmployeeImpl(employeeId);
//        callCenterEmployee = new CallCenterEmployeeImpl();
//    }
//
//    @Override
//    public int id() {
//        return employee.id();
//    }
//
//    @Override
//    public boolean isBusy() {
//        return callCenterEmployee.isBusy();
//    }
//
//    @Override
//    public void doWork() {
//        employee.doWork();
//    }
//
//
//    @Override
//    public CallCenterEmployee getBackup() {
//        return callCenterEmployee.getBackup();
//    }
//
//    @Override
//    public void answerCall(Call call) {
//        callCenterEmployee.answerCall(call);
//    }
//
//    @Override
//    public void setBackup(CallCenterEmployee employee) {
//        callCenterEmployee.setBackup(employee);
//    }
//
//
//}
