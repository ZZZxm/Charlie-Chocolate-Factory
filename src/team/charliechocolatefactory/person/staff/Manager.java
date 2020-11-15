package team.charliechocolatefactory.person.staff;

import team.charliechocolatefactory.person.GeneralManager;
import team.charliechocolatefactory.person.staff.worker.WarehouseWorker;
import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.scene.Scene;
import team.charliechocolatefactory.scene.staffarea.StaffArea;

import java.util.ArrayList;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Manager
 * @description A manager is responsible for one department.
 * @date 2020/11/7 17:17
 */
public class Manager extends Staff{


    public Manager(String name, int age, Sex sex, int salary, StaffArea department) {
        super(name, age, sex, salary, department);
    }

    /**
     * Manager can hire workers for his/her department.
     * @param name name of the new worker
     * @param sex sex of the new worker
     * @param age age of the new worker
     * @param salary salary of the new worker
     */
    public void hireWorker(String name, Sex sex, int age, int salary) {

        department.addWorker(name, age, sex, salary);
    }

    /**
     * Manager can fire workers for his/her department.
     * @param worker the instance of the worker to be fired
     * @return whether the action of fire is successful, the manager can only fire the workers in his/her department.
     */
    public boolean fireWorker(Worker worker) {
        if (this.department == worker.getDepartment()) {
            /* 删除员工 */
            department.removeWorker(worker);
            return true;
        }
        else {
            System.out.println("The worker is not responsible to the manager.");
            return false;
        }
    }

    public void dispatchTask(){
        System.out.println("Received work from the general manager.");
        ArrayList<Worker> workers = this.department.getWorkerList();
        if(workers.isEmpty()){
            System.out.println("Warning!! Here's no worker in this scene.");
        }else{
            for(Worker worker:workers){
                System.out.println("dispatch task to "+worker.getName());
                worker.work();
            }
        }
    }

    /**
     * Managers can move to anywhere.
     * @param dest destination
     */
    @Override
    public boolean moveTo(Scene dest) {
        this.location = dest;
        System.out.println("The manager " + this.name + "moves to " + dest.toString());
        return true;
    }

    /**
     * set the initial asset of the manager
     */
    @Override
    protected void setInitialAsset() {
        this.asset = 100000;
    }

    @Override
    public String toString() {
        return "class Manager extends Staff";
    }

    public void receiveFeedBack() {
        System.out.println(this.department.toString()+" manager received feed back.");
        reportToGeneralManager();
    }

    private void reportToGeneralManager() {
        System.out.println(this.department.toString()+" manager report feed back things to the general manager.");
        GeneralManager.getInstance().receiveFeedBack();
    }
}
