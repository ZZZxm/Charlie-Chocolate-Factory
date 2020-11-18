package team.charliechocolatefactory.person.staff;

import team.charliechocolatefactory.person.staff.worker.WarehouseWorker;
import team.charliechocolatefactory.person.staff.worker.Worker;
import team.charliechocolatefactory.scene.Scene;
import team.charliechocolatefactory.scene.staffarea.StaffArea;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname Manager
 * @description A manager is responsible for one department.
 * @date 2020/11/7 17:17
 */
public class Manager extends Staff{

    public String identity="manager";

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
}
